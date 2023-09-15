public class Order{
	public static void main(String[] args){
	int nums[]={8,3,5,3,7,2,5,1};
	int temp;
	for(int i=0;i<nums.length;i++){
		for (int j=i+1;j<nums.length;j++){
	         if(nums[i]>nums[j]){
			temp=nums[i];
			nums[i]=nums[j];
			nums[j]=temp;

	}
	}
	}
	System.out.println("Acending order is :");
     for(int j=0;j<+nums.length;j++){
	System.out.println(nums[j]);	
	}
	for(int r=0;r<nums.length;r++){
		for (int s=r+1;s<nums.length;s++){
	         if(nums[r]<nums[s]){
			temp=nums[r];
			nums[r]=nums[s];
			nums[s]=temp;

	}
	}
	}
	System.out.println("Decending order is :");
     for(int s=0;s<+nums.length;s++){
	System.out.println(nums[s]);	
}
	
}
}