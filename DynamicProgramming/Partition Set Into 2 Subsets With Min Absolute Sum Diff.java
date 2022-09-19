//Partition Set Into 2 Subsets With Min Absolute Sum Diff

public class Solution{
	
	public int minAbsDiff(int [] arr){
		int n=arr.length;
		int totalSum=0;
		for(int i=0;i<n;i++){
			totalSum+=arr[i];
		}
		boolean[][] dp= new boolean[n][target+1];
		for(int i=0;i<=totalSum;i++){
			boolean dummy=subsetSum(n-1,i,arr);
		}
		int mini=Integer.MAX_VALUE;
		for(int i=0;i<=totalSum;i++){
			if(dp[n-1][i]==true){
				int diff=Math.abs(i-(totalSum-i));
				mini=Math.min(mini,diff);
			}
		}
		return mini;
	}
	
	public boolean subsetSum(int index, int target, int [] arr,int [][] dp){
		if(target==0){
			return true;
		}
		if(index==0){
			return arr[index]==target;
		}
		if(dp[index][target]!=-1){
			return dp[index][target]==1 ? true : false;
		}
		boolean nottaken=subsetSum(index-1, target,arr);
		
		if(arr[index]<=target){
			boolean taken=subsetSum(index-1,target-arr[index],arr);
		}
		dp[index][target]=taken || nottaken ? 1 :0;
		return taken || nottaken;
	}
}

----------------------------------------------------------------


public class Solution{
	
	public int subsetSum(int [] arr){
		int totSum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			totSum=totSum+arr[i];
		}
		
		boolean dp[][]= new boolean[n][totSum+1];
	
		for(int i=0;i<n;i++){
			dp[i][0]=true;
		}
		if(arr[0]<=target){
			dp[0][arr[0]]=true;
		}
		
		for(int ind=1;ind<n;ind++){
			for(int target=1;target<=totSum;target++){
				boolean nottaken=dp[ind-1][target];
				if(arr[ind]<=target){
				boolean taken=dp[inde-1][target-arr[ind]];	
				}
			  dp[ind][target]=	taken || nottaken;
			}
		}
		int mini = 1e9;
        for (int i = 0; i <= totSum; i++) {
           if (dp[n - 1][i] == true) {
           int diff = abs(i - (totSum - i));
            mini = min(mini, diff);
          }
       }
     return mini;
		
	}
}

-------------------------------------------------


public class Solution{
	
	public int subsetSum(int [] arr){
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			totSum=sum+arr[i];
		}
		
		boolean prev[]= new boolean[totSum+1];
	
		for(int i=0;i<n;i++){
			prev[0]=true;
		}
		if(arr[0]<=target){
			prev[arr[0]]=true;
		}
		
		for(int ind=1;ind<n;ind++){
			boolean curr[]= new boolean[totSum+1];
			curr[0]=true;
			for(int target=1;target<=totSum;target++){
				boolean nottaken=prev[target];
				if(arr[ind]<=target){
				boolean taken=prev[target-arr[ind]];	
				}
			  curr[target]=	taken || nottaken;
			}
			prev=curr;
		}
		
		int mini = 1e9;
        for (int i = 0; i <= totSum; i++) {
           if (prev[i] == true) {
           int diff = abs(i - (totSum - i));
            mini = min(mini, diff);
          }
       }
     return mini;
		
	}
}

time complexcity : n*totSum + o(n) + o(n)
space complexcity : o(totSum)