public class floors{
	public static void main(String[] args){
	int floornumbers [][] = {{101,102,103,104,105},{201,202,203,204,205,206},{301,302,303,304,305,306,307},{401,402,403,404,405,406,407,408},{501,502,503,504,505,506,507,508,509}};
	for(int i=0;i<floornumbers.length;i++){
			System.out.println("Floor:" + (i+1));

		for(int j=0;j<floornumbers[i].length;j++){

			if(floornumbers[i][j]==301 || floornumbers[i][j]==302){
				continue;
			}
			System.out.println("    Room:" + floornumbers[i][j]);		
		}	
	}
}
}