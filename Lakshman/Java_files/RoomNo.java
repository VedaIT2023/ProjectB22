public class RoomNo{
	public static void main(String[] args){
	int allfloorno[][]={{101,102,103,104,105},{201,202,203,204,205,206},{301,302,303,304,305,306,307},{401,402,403,404,405,406,407,408},{501,502,503,504,505,506,507,508,509}};
	System.out.println("NO.Of Floors :" + allfloorno.length);
	for(int i=0;i<allfloorno.length;i++){
	System.out.println("Floor NO :"+ (i+1));
	    for(int j=0;j<allfloorno[i].length;j++){
		if(allfloorno[i][j] ==201 || allfloorno[i][j] ==202){
	          continue;
	  }
	       System.out.println("\tRoom No :"+ allfloorno[i][j] );
	
	}
	}
}
}