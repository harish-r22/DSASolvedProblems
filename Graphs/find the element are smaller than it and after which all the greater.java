//find the element are smaller than it and after which all the greater

public class Solution{
	public int findNumber(int [] nums, int n){
		int[] left= new int[n];
		left[0]=Integer.MIN_VALUE;
		for(int i=1;i<n;i++){
			left[i]=Math.max(nums[i-1],left[i-1])
		}
		
		int right=Integer.MAX_VALUE;
		for(int i=n-1;i>=0;i--){
			if(left[i]<nums[i] && right > nums[i]){
				return i;
			}
			right=Math.min(right,nums[i]);
		}
		return -1;
	}
	
}

time complexcity : o(n)