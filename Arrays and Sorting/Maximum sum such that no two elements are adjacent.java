//Maximum sum such that no two elements are adjacent

public class Solution{
	public int maximumSum(int [] nums){
		int n=nums.length;
		return getMaximunSumByNonAdj(nums,n-1);
	}
	pubic int getMaximunSumByNonAdj(int [] nums, int index){
		if(index==0){
			return nums[0];
		}
		if(index< 0){
			return 0;
		}
		int i=nums[index]+getMaximunSumByNonAdj(nums,index-2);
		int j=0+getMaximunSumByNonAdj(nums,index-1);
		return Math.max(i,j);
	}
}

time complexcity: o(2n)
space complexcity : o(n)


