<!doctype html>
<html>
     <head> 
          <meta name="GENERATOR" content=" SuperSQL (Generate Mobile_HTML5) "> 
          <meta charset="UTF-8"> 
          <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"> 
          <!-- SuperSQL JavaScript & CSS --> 
          <link rel="stylesheet" href="jscss/jquery-ui.css"> 
          <link rel="stylesheet" href="jscss/jquery.mobile-1.3.1.min.css"> 
          <link rel="stylesheet" href="jscss/jqm-datebox.min.css"> 
          <link rel="stylesheet" href="jscss/jqm-icon-pack-2.0-original.css"> 
          <link rel="stylesheet" href="jscss/jquery.simplePagination.css"> 
          <script src="jscss/jquery-1.7.1.min.js"></script> 
          <script src="jscss/jquery-ui.min.js"></script> 
          <script src="jscss/supersql.showmore.js"></script> 
          <script src="jscss/jquery.mobile-1.3.1.min.js"></script> 
          <script src="jscss/jqm-datebox.core.min.js"></script> 
          <script src="jscss/jqm-datebox.mode.calbox.min.js"></script> 
          <script src="jscss/jqm-datebox.mode.datebox.min.js"></script> 
          <script src="jscss/jqm-datebox.mode.flipbox.min.js"></script> 
          <script src="jscss/jquery.simplePagination.js"></script> 
          <script src="jscss/jquery.mobile.dynamic.popup.js"></script> 
          <script src="jscss/jquery.iframe-auto-height_re.plugin.js"></script> 
          <script src="jscss/jquery.validate.min.js"></script> 
          <script src="jscss/supersql.prev-next.js"></script> 
          <script type="text/javascript">
<!-- 
var portraitWidth = -1;
var landscapeWidth = -1;
var pcWidth = 1000;
var bootstrap = false;
-->
          </script> 
          <script src="jscss/supersql.js"></script> 
          <!-- Generated CSS --> 
          <link rel="stylesheet" type="text/css" href="jscss/tatsu.css"> 
     </head> 
     <body> 
          <!-- SuperSQL Body  Start --> 
          <!-- data-role=page start --> 
          <div data-role="page" id="p-top1"> 
               <!-- data-role=content start --> 
               <div data-role="content" style="padding:0" id="content1"> 
                    <div id="ssql_body_contents"> 
                         <!-- SSQL Dynamic1 start --> 
                         <!-- SSQL Dynamic1 DIV start --> 
                         <div id="SSQL_DynamicDisplay1" data-role="none">
                              <!-- SSQL Dynamic Display Data1 -->
                         </div> 
                         <!-- SSQL Dynamic1 DIV end --> 
                         <!-- SSQL Dynamic1 JS start --> 
                         <script type="text/javascript">
<!--
SSQL_DynamicDisplay1();	//ロード時に実行
function SSQL_DynamicDisplay1_echo(str){
  document.getElementById("SSQL_DynamicDisplay1").innerHTML = str;
}
function SSQL_DynamicDisplay1(){
	//ajax: PHPへ値を渡して実行
	$.ajax({
		type: "POST",
		url: "tatsu_SSQLdynamic_1.php",
		dataType: "json",
		success: function(data, textStatus){
			if (data.result != "") {
				SSQL_DynamicDisplay1_echo(data.result);
			}
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
			SSQL_DynamicDisplay1_echo(textStatus+"<br>"+errorThrown);
		}
	});
}
//-->
                         </script> 
                         <!-- SSQL Dynamic1 JS end --> 
                         <!-- SSQL Dynamic1 end --> 
                    </div>
                    <!-- Close id="ssql_body_contents" --> 
               </div>
               <!-- Close <div data-role="content"> --> 
               <!-- data-role=content end --> 
               <iframe name="dummy_ifr" style="display:none;">&lt;!-- dummy iframe for Form target --&gt;</iframe> 
          </div>
          <!-- Close <div data-role="page"> --> 
          <!-- data-role=page end --> 
          <!-- SuperSQL Body  End -->   
     </body>
</html>
