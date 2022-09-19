//Minimum coins 2

// unlimited supply
//Minimum Coins

public class SOlution{
	
	public static int miniCoins(int []arr, int target){
		int n=arr.length;
		int dp[][] =new int [n][target+1];
		for(int row[] : dp){
			Arrays.fill(row,-1);
		}
		return miniCoinsUtil(n-1, target, arr, dp);
		
	}
	
	public static int miniCoins(int index, int T,int [] arr, int [][] dp){
		if(index==0){
			if(T%arr[0]==0)
				return 1;
			else
				return 0;
		}
		if(dp[index][T]!=-1){
			return dp[index][T]
		}
		int notTaken=miniCoins(index-1,T,arr,dp);
		int taken=Integer.MAX_VALUE;
		if(arr[index]<=T){
			taken=miniCoins(index-1,T-arr[index],arr, dp);
		}
		dp[index][target]=taken+notTaken;
	}
}
-----------------------------------


public class SOlution{
	
	public static int miniCoins(int []arr, int target){
		int n=arr.length;
		int dp[][] =new int [n][target+1];
		for(int i=0;i<=target;i++){
			if(i%arr[0]==0){
				return 1;
			}else{
				return 0;
			}
		}
		for(int index=1;index<n;index++){
			for(int cap=0;cap<=T;cap++){
				int notTaken=dp[index-1][T];
		        int taken=Integer.MAX_VALUE;
		        if(arr[index]<=T){
			     taken=dp[index-1][T-arr[index]];
		        }
				dp[index][target]=taken+notTaken;
			}
		}
		return dp[n-1][target];
		
	}
}