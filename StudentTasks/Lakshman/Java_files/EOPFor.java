public class EOPFor{
	public static void main(String[] args){
	int nums[]={2,7,4,9,3,8,1,6};
	System.out.println("Even numbers are :");
	for(int i=0;i<nums.length;i++){
	   if(nums[i]%2==0){
	     System.out.println(nums[i]);
	}
	}
	System.out.println("Odd numbers are :");
	for(int i=0;i<nums.length;i++){
	   if(nums[i]%2!=0){
	     System.out.println(nums[i]);
	}
	}
}
}