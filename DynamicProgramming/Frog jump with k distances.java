//Frog jump with k distances

public class Solution{
	
	public int jumpWithKdistances(int arr[], int k){
		int n=arr.length;
		return solve(n, arr, k);
	}
	
	public int solve(int index, int [] arr, int k ){
		if(index==0)
			return 0;
		mmSteps=Integer.MAX_VALUE;
		for(int j=1;j<=k;j++){
			int jump=solve(index-j,arr,k) + Math.abs(arr[index]-arr[index-j]);
			mmSteps=Math.min(mmSteps,jump);
			
		}
		return mmSteps;
	}
}

time complexcity : o(2^k)
space complexcity : o(n)

---------------------------------------------------------

  
  public class Solution{
	
	public int jumpWithKdistances(int arr[], int k){
		int n=arr.length;
		int dp[]= new int[n];
		Arrays,fill(dp,-1);
		return solve(n, arr, k,dp);
	}
	
	public int solve(int index,int[] arr, int k,dp){
		if(index==0)
			return 0;
		mmSteps=Integer.MAX_VALUE;
		if(dp[index]!=-1){
			return dp[index]
		}
		for(int j=1;j<=k;j++){
			int jump=solve(index-j,arr,k) + Math.abs(arr[index]-arr[index-j]);
			mmSteps=Math.min(mmSteps,jump);
			
		}
		return dp[index]=mmSteps;
	}
}


time complexcity : o