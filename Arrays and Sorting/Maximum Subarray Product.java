// Maximum product subArray

2,3,-1,4


public class solution{
	public int maxProductSubArray(int nums[]){
		int maxValue=nums[0];
		int n=nums.length;
		int prod=1;
		for(int i=0;i<n;i++){
			int mul=nums[i];
			for(int j=i+1;j<n;j++){
			   maxValue=Math.max(maxValue,mul);
			   mul*=nums[j];
			}
			maxValue=Math.max(maxValue,mul);
		}
		return maxValue;
	}
	
}

time complexity o(n2)




//optimised


public class Solution{
	public int maxProductSubArray(int nums[]){
		int local_max=0;
		int local_min=0;
		int maxValue=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]==0){
				local_max=1;
				local_min=1;
			}
			int temp=local_max*nums[i];
			local_max=Math.max(nums[i],Math.max(local_max*nums[i],local_min*nums[i]));
			local_min=Math.min(nums[i],Math.min(temp,local_min*nums[i]));
			maxValue=Math.max(local_max,maxValue);
		}
		return maxValue;
	}
}

time complexity o(n)