//Count Subsets with Sum K 

public class Solution{
	public int countSubsets(int [] arr, int target){
		int n=arr.length;
		return countSubsetsUtil(n-1,target,arr);
	}
	
	public int countSubsetsUtil(int index, int target, int [] arr){
		if(target==0){
			return 1;
		}
		if(index==0){
			return arr[index]==target;
		}
		
		int notTake=countSubsetsUtil(index-1,target,arr);
		int take =0;
		if(arr[index]<=target){
			take=countSubsetsUtil(index-1,target-arr[index],arr);
		}
		return take+notTake;
	}
}

----------------------------------

public class Solution{
public int countSubsets(int [] arr, int target){
		int n=arr.length;
		int dp[][]= new int [n][target+1];
		for(int [] row : dp){
			Arrays.fill(row,-1);
		}
		return countSubsetsUtil(n-1,target,arr,dp);
	}
	
	public int countSubsetsUtil(int index, int target, int [] arr,dp){
		if(target==0){
			return 1;
		}
		if(index==0){
			return arr[index]==target;
		}
		if(dp[index][target]!=-1){
			return dp[index][target];
		}
		int notTake=countSubsetsUtil(index-1,target,arr,dp);
		int take =0;
		if(arr[index]<=target){
			take=countSubsetsUtil(index-1,target-arr[index],arr,dp);
		}
		return dp[index][target]=take+notTake;
	}
}


----------------------------------------

public class Solution{
	
	public int countSubsets(int [] arr, int k){
		int n=arr.length;
		int dp[][]= new int [n][k+1];
		for(int i=0;i<n;i++){
			dp[i][0]=1;
		}
		if(arr[0]<k){
			dp[0][arr[0]]=1;
		}
		
		for(int index=1;index<n;index++){
			for(int target=1;target<=k;target++){
				int notTake=dp[index-1,target];
		int take =0;
		if(arr[index]<=target){
			take=dp[index-1,target-arr[index]];
		}
		dp[index][target]=take+notTake;
			}
		}
		return dp[n-1,k];
	}
}	
	
	
	
	--------------------------------------------------
	
	public class Solution{
	
	public int countSubsets(int [] arr, int k){
		int n=arr.length;
		int prev[]= new int prev[k+1];
		for(int i=0;i<n;i++){
			prev[0]=1;
		}
		if(arr[0]<k){
			prev[arr[0]]=1;
		}
		
		for(int index=1;index<n;index++){
			int curr[]= new int curr[k+1];
			curr[0]=1;
			for(int target=1;target<=k;target++){
				int notTake=prev[target];
		int take =0;
		if(arr[index]<=target){
			take=prev[target-arr[index]];
		}
		curr[target]=take+notTake;
			}
			prev=curr;
		}
		return prev[k];
	}
}	

------------------------------