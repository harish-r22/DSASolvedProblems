//Maximum sum of non-adjacent elements

public class Solution{
	public int maxSumofNonAdjascentele(int [] arr){
		int n=arr.length;
		return solve(n ,arr);
	}
	public int solve(int index, int [] arr){
		if(index==0)
			return arr[0];
		
		if(index < 0)
			return -1;
		
		int pick =  arr[index] + solve(index-2,arr);
		
		int notPick = 0+solve(index-1,arr);
		return Math.max(pick,notPick);
	}
	
}

time complexcity : o(2^n)
space complexcity : o(n)

-------------------------------------------------------------

public class Solution{
	public int maxSumofNonAdjascentele(int [] arr){
		int n=arr.length;
		int dp[] = new int[n];
		Arrays.fill(dp,-1);
		return solve(n,arr,dp);
	}
	public int solve(int index, int [] arr, int [] dp){
		if(index==0)
			return arr[0];
		
		if(index < 0)
			return -1;
		if(dp!=-1){
			return dp[index];
		}
		int pick =  arr[index] + solve(index-2,arr,dp);
		
		int notPick = 0 + solve(index-1,arr,dp);
		
		return dp[index]=Math.max(pick,notPick);
	}
}

time complexcity : o(n)
space complexcity : o(n) + o(n)


----------------------------------------------------------


public class Solution{
	public int maxSumofNonAdjascentele(int [] arr){
		int n=arr.length;
		int dp[] = new int[n];
		Arrays.fill(dp,-1);
		dp[0]=arr[0];
		for(int index=1;index<n;index++){
			int pick=arr[index];
			if(index>1)
				pick+=dp[index-2];
			int notPick=0+dp[inde-1];
			dp[index]=Math.max(pick,notPick);
		}
		return dp[n-1];
	}
}

time complexcity : o(n)
space complexcity : o(n) 

-----------------------------------------------------

public class Solution{
	public int maxSumofNonAdjascentele(int [] arr){
		int n=arr.length;
		int prev=arr[0];
		int prev2=0;
		for(int index=1;index<n;index++){
			int pick=arr[index];
			if(index>1)
				pick+=prev2;
			int notPick=0+prev;
			int curri= Math.max(pick,notPick);
			prev2=prev;
			prev=curri;
		}
		return prev;
	}
}



time complexcity : o(n)
space complexcity : o(1) 