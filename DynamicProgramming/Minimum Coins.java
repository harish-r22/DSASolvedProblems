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
				return T/arr[0];
			else
				return (int)Math.pow(10,9);
		}
		if(dp[index][T]!=-1){
			return dp[index][T]
		}
		int notTaken=0+miniCoins(index-1,T,arr,dp);
		int taken=Integer.MAX_VALUE;
		if(arr[index]<=T){
			taken=1+miniCoins(index-1,T-arr[index],arr, dp);
		}
		dp[index][target]=Math.min(taken,notTaken);
	}
}