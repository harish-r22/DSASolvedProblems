//Count Partitions with Given Difference 

public class Solution{
	public int countSubsets(int [] arr, int diff){
		int n=arr.length;
		int totalSum=0;
		for(int i=0;i<n;i++){
			totalSum+=arr[i];
		}
		if(totSum-d<0) return 0;
       if((totSum-d)%2==1) return 0;
	   
		int target=(totalSum-diff)/2;
		int dp[][] = new int [n][target+1];
		for(int [] row : dp){
			Arrays.fill(row,-1);
		}
		return countSubsetsUtil(n-1,target,arr,dp);
	}
	
	public int countSubsetsUtil(int index, int target, int [] arr){
		
		if(index==0){
			if(target==0 && arr[index]){
				return 2;
			}
			if(target==0 || target==arr[0]){
				return 1;
			}
		}
		if(dp[index][target]!=-1){
			return dp[index][target];
		}
		int notTake=countSubsetsUtil(index-1,target,arr);
		int take =0;
		if(arr[index]<=target){
			take=countSubsetsUtil(index-1,target-arr[index],arr);
		}
		return take+notTake;
	}

}