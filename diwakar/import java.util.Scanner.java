import java.util.Scanner;
public class DuplicateChar{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		int b = a.length();
		int count = 0;
		for(int i=0;i<b;i++){
			char c = a.charAt(i);
           		boolean isDuplicate = false;

            	for (int j = i + 1; j < b; j++) {
               		 if (c == a.charAt(j)) {
                  	 isDuplicate = true;
                    	 break;
                		}
           		 }

            if (isDuplicate) {
                System.out.println("Duplicate character: " + c);
                count++;
            	}
        	}

        System.out.println("Total duplicate characters: " + count);

}

}