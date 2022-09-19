//Partition Equal Subset Sum

public class Solution{
	public boolean subsetSum(int [] arr ){
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		if(sum%2==1){
			return false;
		}else{
			int target=sum/2;
			boolean res=subsetSum(n-1,target,arr);
		}
		
		return res;
	}
	
	public boolean subsetSum(int index, int target, int [] arr){
		if(target==0){
			return true;
		}
		if(index==0){
			return arr[index]==target;
		}
		boolean nottaken=subsetSum(index-1, target,arr);
		
		if(arr[index]<=target){
			boolean taken=subsetSum(index-1,target-arr[index],arr);
		}
		return taken||nottaken;
	}
}

time coplexcity : o(2^n)
space coplexcity : o(n)

------------------------------


public class Solution{
	public boolean subsetSum(int [] arr , int target){
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		if(sum%2==1){
			return false;
		}else{
			int target=sum/2;
			int [][] dp= new int[n][target+1];
			for(int [] row: dp){
				Arrays.fill(row,-1);
			}
			boolean res=subsetSum(n-1,target,arr,dp);
		}
		
		return res;
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

----------------------------------------------

public class Solution{
	
	public boolean subsetSum(int [] arr, int target){
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		if(sum%2==1){
			return false;
		}else{
		int target=sum/2;
		boolean dp[][]= new boolean[n][k+1];
		for(int i=0;i<n;i++){
			dp[i][0]=true;
		}
		if(arr[0]<=target){
			dp[0][arr[0]]=true;
		}
		
		for(int ind=1;ind<n;ind++){
			for(int target=1;target<=k;target++){
				boolean nottaken=dp[ind-1][target];
				if(arr[ind]<=target){
				boolean taken=dp[inde-1][target-arr[ind]];	
				}
			  dp[ind][target]=	taken || nottaken;
			}
		}
		return dp[n-1][k];
		}
	}
}

--------------------------------------------------------


public class Solution{
	public boolean subsetSum(int [] arr, int target){
		int sum=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
			sum=sum+arr[i];
		}
		if(sum%2==1){
			return false;
		}else{
		int target=sum/2;
		boolean prev[]= new boolean[k+1];
		prev[0]=true;
		if(arr[0]<=k){
			prev[arr[0]]=true;
		}
		
		for(int ind=1;ind<n;ind++){
			boolean[] curr = new boolean[k+1];
			for(int target=1;target<=k;target++){
				boolean nottaken=prev[target];
				if(arr[ind]<=target){
				boolean taken=prev[target-arr[ind]];	
				}
				curr[target]=taken || nottaken;
			}
		   prev=curr;	
			
		}
		return prev[k];
		}
	}
}