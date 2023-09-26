public class EvenOddPrime {
	public static void main(String[] args) {
	    int number = 20;
	    System.out.println("List of Even numbers Between 1 to  "+number+"" );
		for(int i=0;i<=20;i++) {
		    if(i%2 == 0) {
		        System.out.println(i + " ");
		    }
		}
		System.out.println("List of Odd Numbers Between 1 to "+number+"");
		for(int i=0;i<=20;i++) {
		    if(i%2 != 0) {
		        System.out.println(i + " ");
		    }
		}
		System.out.println("List of Prime Numbers Between "+number+"");
		for(int i=1;i<=20;i++) {
		    int count=0;
		    for (int j=1;j<=i;j++) {
		        if (i%j == 0) {
		        count++;
		    }
		}
		if(count == 2) {
		System.out.println(i);
		}
	    }
	}
}
