//Chocolate Distribution Problem

public class solution{
	public static int distributeChocolate(int [] nums, int m){
		int n=nums.length;
		if(n<m){
			return -1;
		}
		int min_diff=Integer.MAX_VALUE;
		for(int i=0;i+m-1 < n;i++  ){
			int diff=nums[i+m-1]-nums[i];
			if(diff < min_diff){
				min_diff=diff;
			}
		}
		return min_diff;
	}
	
	public static void main(String [] args){
		int [] nums={7, 3, 2, 4, 9, 12, 56};
		int m=3;
		System.out.println(distributeChocolate());
	}
}