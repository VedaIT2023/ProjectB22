public class Reverseword{
	public static void main(String[] args){
	String name = "Pavan Mathi" ;
	String str = " ";
	String words[] = name.split(" ");
	for(int i=0;i<words.length;i++){
		System.out.print(words[i] + " ");
	}
	System.out.println(" ");
	for(int i=words.length-1;i>=0;i--){
		String a = str + words[i] + " ";
		System.out.print(a);	
	}
		
}
}