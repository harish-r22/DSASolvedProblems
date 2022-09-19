Find the maximum product subarray


public class Solution{

   public int findMaximumProductSubArray(int [] nums){
	   int n=nums.length;
	   int local_maxima=0;
	   int local_minima=0;
	   int ans=0;
	   
	   for(int i=0;i<n;i++){
		   if(nums[i]==0){
			   local_maxima=1;
			   local_minima=1;
		   }
		   int temp=nums[i]*local_maxima;
		   local_maxima=Math.max(nums[i] * Math.max(nums[i]*local_maxima , local_minima*nums[i]));
		   local_minima=Math.min(nums[i] * Math.min(nums[i] * local_minima ,temp);
		   ans=Math.max(local_maxima,ans);
	   }
	   return ans;
   }

}