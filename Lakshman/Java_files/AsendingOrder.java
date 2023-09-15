public class AsendingOrder{
	public static void main(String[] args){
	int nums[]={2,6,1,9,3,7};
	System.out.println("Acending order is :");
        for(int i=0;i<+nums.length;i++){
	System.out.println(nums[i]);	
	}
	for(int j=0;j<nums.length;j++){
		for (int s=r+1;s<nums.length;s++){
	         if(nums[i]<nums[j]){
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;
	}
	}
}

}