using System;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Xml;
using UnityEngine;
using System.Collections;

public class tatsu : MonoBehaviour {
	public Rigidbody rigid;
	public Vector3 size = new Vector3(0, 0, 0);
	static int billmovex = 0;
	static int billmovey = 0;
	static int billmovez = 0;
	float exhmovex = 0f;
	float exhmovey = 0f;
	float exhmovez = 0f;
	int exhmoveflag = 0;
	void Start () {
		GameObject[] array = new GameObject[500];
		String[] sarray = new String[100];///////////////////テキスト生成
		int groupflag = 1;

		XmlDocument xmlDocument = new XmlDocument();
		xmlDocument.Load("/Users/tatsu/Documents/workspace/NewSSQL/test_queries/tatsu/tatsu.xml");
		XmlElement elem = xmlDocument.DocumentElement; //elem.Nameはdoc

		if (elem.HasChildNodes == true) {
	        XmlNode childNode2 = elem.FirstChild;
	        while (childNode2 != null) {
				if(groupflag ==1){
					String[] genrearray = {};///////////タイトル表示
					int r;
					float objhigh = 2.8f;
					float standhigh = 1.25f;
					int museumcount = 0;
					
					int[] xarray = new int[500];
					int[] xxarray = new int[100];
					int[] zarray = new int[500];
					int[] zzarray = new int[100];
					int[] yarray = new int[500];
					int[] yyarray = new int[100];
					for(int m=20, l=0; l<1; m = m-5,l++){	
						xxarray[l] = m;
					}
					for(int p=0, q=0; p<500; p++,q++){  
						if(q == 1){
							q=0;
						}
						xarray[p] = xxarray[q];	
					}
					for(int n=10,k=0; k<1; n = n-5,k++){
						zzarray[k] = n;
					}
					for(int p=0, q=0; p<500; p++,q++){ 
						if(q == 1){
							q=0;
						}
						zarray[p] = zzarray[q];	
					}
					for(int m=0, l=0; l<10; m += 2, l++){
						yyarray[l] = m; 
					}
					for(int p=0,q=0; p<500; p++){ 
						if((p!=0) && (p%(1*1)==0)){
							q++;
						}
						yarray[p] = yyarray[q];	
					}
					int objx = 0;/////////////museum change
		        	if(childNode2.HasChildNodes == true){
	        			XmlNode childNode = childNode2.FirstChild; ////////category
						///////////group追加 end
				        while (childNode != null) { //childNode.Nameはcategory
				        	museumcount++;
				          	if (childNode.HasChildNodes == true) {
					            for (int i=0; i < childNode.ChildNodes.Count; i++) {
					              	XmlNode dataNode2= childNode.ChildNodes[i]; //dataNode.NameはShapeというか二種類目のcategory

									if (dataNode2.HasChildNodes == true) {//////////n2 change
									    for (int k=0; k < dataNode2.ChildNodes.Count; k++) {
									      	XmlNode dataNode= dataNode2.ChildNodes[k]; 

						     		       for (int j=0; j < dataNode.ChildNodes.Count; j++) {     /////element
					                			XmlNode xmlAttr = dataNode.ChildNodes[j]; //xmlAttrはkindCubekind  
												//array[j] = Instantiate(Resources.Load(xmlAttr.InnerText)) as GameObject;///////bill change tatsu:code change
												sarray[j] = xmlAttr.InnerText;//オブジェクトのテキスト生成のため
												array[j] = CreateObject.MakeObject((XmlElement)xmlAttr);
												r = j/1;
												if(j == 0){ //0を割ることはできないから 
													r = 0; 
												} 
						
												if(k == 0){
													//stand生成 

													array[j].transform.position  = new Vector3 (xarray[j]+objx, objhigh+yarray[j], zarray[r]); 

													array[j].transform.position  += new Vector3 (billmovex, billmovey, billmovez); 
													array[j].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);
												}else if(k == 1){
													if(exhmoveflag == 0){
	 													exhmovex -= 1.3f;
														exhmoveflag++;
													}
													//stand生成 

													array[j].transform.position  = new Vector3 (xarray[j]+objx, objhigh+yarray[j], zarray[r]); 

													array[j].transform.position  += new Vector3 (billmovex, billmovey, billmovez); 
													array[j].transform.position  += new Vector3 (exhmovex, exhmovey, exhmovez);
	 											}

												size = Get(array[j]);
												array[j].AddComponent<Rigidbody>();
												rigid = array[j].GetComponent<Rigidbody>();
												if (rigid) {
												     rigid.constraints = RigidbodyConstraints.FreezeAll;
												}
												array[j].tag = "GameController";
												array[j].AddComponent<BoxCollider>();

												float nx = size.x;
												float ny = size.y;
												float nz = size.z;
												
												float max = nx;
												if(max < ny){
													max = ny;
												}
												if(max < nz){
													max = nz;
												}
												float rate = 1.2f / max;
												float mx = array[j].transform.localScale.x;
												float my = array[j].transform.localScale.y;
												float mz = array[j].transform.localScale.z;
												array[j].transform.localScale = new Vector3(mx*rate, my*rate, mz*rate); 
											} 
										} 
									} 
								} 
							} 
							childNode = childNode.NextSibling; 
							exhmovex = 0f;
							exhmovey = 0f;
							exhmovez = 0f;
							exhmoveflag = 0;
							objx += -50;/////////////////////////////museumchange
						}	
					}
					//museum生成
					for(int i=0; i<museumcount; i++){	
					}
			 		for(int i=0; i<1; i++){	
					}
					for(int i=0; i<museumcount; i++){	
					if(i>=1){
					}
					}
					for(int i=0; i<museumcount; i++){	
					}
					for(int i=0; i<1; i++){	
					}
					//タイトル生成とビル内案内矢印
					for(int i=0; i<museumcount; i++){
						if(i < museumcount-1){
						}

					}	
					childNode2 = childNode2.NextSibling;
				}
				groupflag++;
			}/////////group追加end
		}
	}

	Vector3 Get(GameObject gameObject)
        {
            if(gameObject.GetComponent<Renderer>()){
               return gameObject.GetComponent<Renderer>().bounds.size;
            } else if(gameObject.GetComponent<Collider>()){
               return gameObject.GetComponent<Collider>().bounds.size;
            } else if(gameObject.GetComponent<Mesh>()){
               return gameObject.GetComponent<Mesh>().bounds.size;
            }
        
            if(gameObject.transform.childCount == 1){
                return Get(gameObject.transform.GetChild(0).gameObject);
            } else if(gameObject.transform.childCount == 0){
            	return new Vector3(0,0,0);
            } else {
                return(new Vector3(GetSizeXParent(gameObject),GetSizeYParent(gameObject),GetSizeZParent(gameObject)));
            }
        }

    float GetSizeXParent(GameObject gameObjectParent){
        //GameObject[] childrenGameObjects = gameObjectTemp.
            GameObject firstGameObject = null, lastGameObject = null;
            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;
            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;
            float sizeX = 0;
            foreach (Transform child in gameObjectParent.transform)
            {
                if (child.transform.position.x < firstGameObject.transform.position.x)
                {
                    firstGameObject = child.gameObject;
                    continue;
                }

                if (child.transform.position.x > lastGameObject.transform.position.x)
                {
                    lastGameObject = child.gameObject;
                    continue;
                }
            }
            
            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))
            {
                sizeX = (lastGameObject.transform.position.x - firstGameObject.transform.position.x) + Get(lastGameObject).x / 2 + Get(firstGameObject).x / 2;
            }
            
            return sizeX;
    }
    
    float GetSizeYParent(GameObject gameObjectParent){
       //GameObject[] childrenGameObjects = gameObjectTemp.
            GameObject firstGameObject = null, lastGameObject = null;
            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;
            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;
            float sizeY = 0;
            foreach (Transform child in gameObjectParent.transform)
            {
                if (child.transform.position.y < firstGameObject.transform.position.y)
                {
                    firstGameObject = child.gameObject;
                    continue;
                }
                
                if (child.transform.position.y > lastGameObject.transform.position.y)
                {
                    lastGameObject = child.gameObject;
                    continue;
                }
            }
            
            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))
            {
                sizeY = (lastGameObject.transform.position.y - firstGameObject.transform.position.y) + Get(lastGameObject).y / 2 + Get(firstGameObject).y / 2;
            }
            
            return sizeY;
    }
    
    float GetSizeZParent(GameObject gameObjectParent){
        //GameObject[] childrenGameObjects = gameObjectTemp.
            GameObject firstGameObject = null, lastGameObject = null;
            firstGameObject = gameObjectParent.transform.GetChild(0).gameObject ;
            lastGameObject = gameObjectParent.transform.GetChild(1).gameObject;
            float sizeY = 0;
            foreach (Transform child in gameObjectParent.transform)
            {
                if (child.transform.position.z < firstGameObject.transform.position.z)
                {
                    firstGameObject = child.gameObject;
                    continue;
                }

                if (child.transform.position.z > lastGameObject.transform.position.z)
                {
                    lastGameObject = child.gameObject;
                    continue;
                }
            }
            
            if ((firstGameObject != null) && (lastGameObject != null) && (firstGameObject != lastGameObject))
            {
                sizeY = (lastGameObject.transform.position.z - firstGameObject.transform.position.z) + Get(lastGameObject).z / 2 + Get(firstGameObject).z / 2;
            }
            
            return sizeY;
    }
}

