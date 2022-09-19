//Maximum Subarray

[5,4,-1,7,8]
class Solution {
	public int getMaxSum(int [] nums){
		int curSum=nums[0];
		int maxSum=nums[0];
		for(int i=1;i<nums.length;i++){
			curSum=Math.max(curSum+nums[i],nums[i]);
			maxSum=Math.max(curSum,maxSum);
		}
		return maxSum;
	}
}