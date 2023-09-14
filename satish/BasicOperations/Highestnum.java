public class highestnum {
	public static void main(String[] args) {
	int num[] = {1,3,5,6,9,12,16};
	int max = num[0];
	for(int i=1;i<num.length;i++) {
		if(num[i] > max) {
			max=num[i];
			}
		}
		System.out.println("First Highest Number :" + max);
	int max1 = num[0];
	for(int i=1;i<num.length-1;i++) {
		if(num[i] > max1) {
			max1=num[i];
			}
		}
		System.out.println("Second Highest Number :" + max1);
	
	}
}