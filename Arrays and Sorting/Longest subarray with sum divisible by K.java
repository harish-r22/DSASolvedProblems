//Longest subarray with sum divisible by K

public class Solution{
	public int longestSubarrWthSumDivByK(int [] nums,int k){
		int n=nums.length;
		int longestLen=0;
		for(int i=0;i<n;i++){
			int sum=nums[i];
			for(int j=i+1;j<n;j++){
				sum+=nums[j];
				if(sum%3==0){
					longestLen=Math.max(longestLen,j-i+1);
				}
			}
		}
		return longestLen;
		
	}
}

time complexcity o(n2)
space complexcity: o(1)

------

optimization


public class Solution{
	public int longestSubarrWthSumDivByK(int [] nums,int k){
		int [] count= new int[k];
		int sum=0
		for(int num: nums){
			sum+=(num%k +k)%k;
			count[sum%k]++;
		}
		int result=count[0];
		for(int c: counts){
			result+=c (c-1)/2;
		}
		return result;
	}
}