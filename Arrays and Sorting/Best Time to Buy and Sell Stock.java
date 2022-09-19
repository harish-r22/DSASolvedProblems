//121. Best Time to Buy and Sell Stock
[7,1,5,3,6,4]

public class Solution{
	public int maxProfit(int [] nums){
		int profit=0;
		int maxProfit=0;
		int n=nums.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(nums[j]>nums[i]){
                    profit=nums[j];  
                    maxProfit=Math.max(maxProfit,profit-nums[i]);
                }
			}
		}
		return maxProfit;
	}
}

 time complexity : o(n2)
 --------------------
 
public class solution{
	public int maxProfit(int [] nums){
		int profit=0;
		int minProfit=Integer.Max_VALUE;
		for(int i=0;i<nums.length;i++){
			minProfit=Math.min(minProfit,nums[i]);
			profit=Math.max(profit, nums[i]-minProfit);
		}
		return profit;
	}
}

time complexity o(n)


//jump


public class solution{
	public boolean maxJump(int [] nums){
		int n=nums.length;
		int max_reach=0;
		for(int i=0;i<n;i++){
			if(max_reach<i){
				return false;
			}
			max_reach=Math.max(max_reach,i+nums[i]);
		}
		return true;
	}
}