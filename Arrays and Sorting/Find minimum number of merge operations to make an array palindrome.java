//Find minimum number of merge operations to make an array palindrome


public class Solution{
	public int findNumberMergeOperation(int [] nums){
		int n=nums.length;
		int low=0,high=n-1;
		int count=0;
		while(low<=high){
			if(nums[low]==nums[high]){
				low++;
				high--;
			}else if(nums[low]>nums[high]){
				high--;
				nums[high]+=nums[high+1];
				count++;
			}else{
				low++;
				nums[low]+=nums[low-1];
				count++;
			}
		}
		return count;
	}
}