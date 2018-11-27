<?php
    $ret = array();
    $ret['result'] = "";

    $table = 'solar s';
    $where = "";
    $dynamic_a_Flg = array("false");
    $dynamic_mail_Flg = array("false");
    $dynamic_pop_Flg = array("false");
    $groupby = "";
    $having = "";
    $orderby = "";
    $orderby_atts = "";
    $limit = "";

    $dynamic_db1 = pg_connect ("host=localhost dbname=tatsu user=tatsu");
	$sql_a1 = array('s.size', 's.location', 's.id');
	$sql_g = getG($groupby, $having, $orderby);

	$sql1 = getSQL($sql_a1, $orderby_atts, $table, $where, $sql_g, $limit, null, null);
    $result1 = pg_query($dynamic_db1, $sql1);

    //$i = 0;
    $j = 0;
    $pop_num = 0;
    $b = "";

$array1_1 = array();
$array2_1 = array();
$array3_1 = array();
while($row1 = pg_fetch_row($result1)){
	$key2 =  $row1[0];
	if(array_key_exists($key2, $array2_1)){
		if(!in_array(array($row1[1]), $array2_1[$key2])){
			array_push($array2_1[$key2], array($row1[1]));
		}
	}else{
		array_push($array1_1, array($row1[0]));
		$array2_1 += array($key2 => array(array($row1[1])));
	}
	$key3 =  $key2.'_'.$row1[1];
	if(array_key_exists($key3, $array3_1)){
		if(!in_array(array($row1[2]), $array3_1[$key3])){
			array_push($array3_1[$key3], array($row1[2]));
		}
	}else{
		$array3_1 += array($key3 => array(array($row1[2])));
	}
}

    for($i1=0; $i1<count($array1_1); $i1++){
          //$b .= str_replace('___SSQL_DynamicFunc_CountLabel___', '_'.$i, $row[$j]);
          $b .= '
<div class="TFE10007 ">
<DIV Class="ui-grid #0 TFE10006">
<div class="ui-block TFE10000">
'.$array1_1[$i1][0].'
</div>

<div class="ui-block TFE10005">
';

          $key2 = $array1_1[$i1][0];
          for($i2=0; $i2<count($array2_1[$key2]); $i2++){
          $b .= '

<div class="TFE10005 ">
<DIV Class="ui-grid #1 TFE10004">
<div class="ui-block TFE10001">
'.$array2_1[$key2][$i2][0].'
</div>

<div class="ui-block TFE10003">
';

          $key3 = $key2.'_'.$array2_1[$key2][$i2][0];
          for($i3=0; $i3<count($array3_1[$key3]); $i3++){
          $b .= '

<div class="TFE10003 ">
'.$array3_1[$key3][$i3][0].'
</div>
';
          }

          $b .= '
</div>

</DIV c1>
</div>
';
          }

          $b .= '
</div>

</DIV c1>
</div>
';
    }
    pg_close($dynamic_db1);

    $ret['result'] = $b;

    //header("Content-Type: application/json; charset=utf-8");
    echo json_encode($ret);


function getSQL($sql_a, $orderby_atts, $table, $where, $sql_g, $limit, $sql_a2, $row){
	$sql = getSF($sql_a, $orderby_atts, $table);
	if(is_null($sql_a2)){
		if($where != '')	$sql .= ' WHERE '.$where.' ';
		$sql .= $sql_g.' '.$limit;
	}else{
		$sql .= ' WHERE ';
		if($where != '')	$sql .= $where.' AND ';
		$sql .= getW($sql_a2, $row).$sql_g;
	}
	return $sql;
}
function getSF($sql_a, $orderby_atts, $table){
	return 'SELECT DISTINCT '.getAs($sql_a).$orderby_atts.' FROM '.$table;
}
function getAs($atts){
	$r = '';
	foreach($atts as $val){
    	$r .= getA($val).',';
    }
	return substr($r, 0, -1);
}
function getA($att){
	$sql_as = 'COALESCE(CAST(';
	$sql_ae = " AS varchar), '')";
	return $sql_as.$att.$sql_ae;
}
function getW($al, $ar){
	$r = '';
	$and = ' AND ';
	for($i=0 ; $i<count($al); $i++){
		$r .= $al[$i]." = '".$ar[$i]."'".$and;
	}
	return rtrim($r, $and);
}
function getG($groupby, $having, $orderby){
	$r = '';
	if($groupby != '')	$r .= ' GROUP BY '.$groupby.' ';
	if($having != '')	$r .= ' HAVING '.$having.' ';
	$r .= ' '.$orderby;
	return $r;
}

function checkHTMLsc($str){
	return htmlspecialchars($str, ENT_QUOTES, 'UTF-8');
}
?>

