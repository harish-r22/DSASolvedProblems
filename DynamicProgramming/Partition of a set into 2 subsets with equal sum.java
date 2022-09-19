//Partition of a set into 2 subsets with equal sum


public class Solution{
     public boolean checkequalSubset(int [] arr, int n ){
	     int sum=0;
		 if(arr.length%2!=0)
			 return false;
	     for(int i=0;i<n;i++{
		    sum=sum+nums[i];
		 }
		 int target=sum/2;
	    return checkequalSubset(arr, n-1 ,target);
	 }
	 
	 public boolean checkequalSubset(int [] arr, int index, int target){
		 if(target==0){
			 return true;
		 }
		 if(target <= arr[0])
			 return true;
		 boolean notTake=checkequalSubset(arr, index-1,target);
		 boolean take=false;
		 if(target >=arr[index] ){
			 taken=checkequalSubset(arr,index-1,target-arr[index]);
		 }
		 return take||notTake;
	 }
}


time complexcity : 2^n


------------------------------------------------------

// memoization

public class Solution{
     public boolean checkequalSubset(int [] arr, int n ){
	     int sum=0;
		 for(int i=0;i<n;i++{
		    sum=sum+nums[i];
		 }
		 if(sum%2==1)
			 return false;
		 else{
		  int target=sum/2;	 
		  int dp[][]= new int[n][n];
		  for(int [] a:dp){
			 Arrays.fill(a,-1);
		  }
		 }
	    return checkequalSubset(arr, n-1 ,target,dp);
	 }
	 
	 public boolean checkequalSubset(int [] arr, int index, int target){
		 if(target==0){
			 return true;
		 }
		 
		 if(target <= arr[0])
			 return true;
		 
		 if(dp[index][target]!=-1)
			 return dp[index][target]==0  ? false : true;
		 boolean notTake=checkequalSubset(arr, index-1,target);
		 boolean take=false;
		 if(target >=arr[index] ){
			 taken=checkequalSubset(arr,index-1,target-arr[index]);
		 }
		 dp[index][target] = ( take || notTake) ? 1 : 0;
		 return (take || notTake );
	 }
} 


-------------------------------------

//tabulation


public class Solution{
	public boolean checkequalSubset(int [] arr , int n){
		int sum=0;
		 for(int i=0;i<n;i++{
		    sum=sum+nums[i];
		 }
		 if(sum%2==1)
			 return false;
		 else{
		 int k=sum/2;
		 boolean [][] dp = new boolean [n][k];
		 
         
         for(int i=0;i<n;i++){
			 dp[0][i]=true;
		 }
          
           if(arr[0]<=k)
            dp[0][arr[0]] = true;
           
          for(int index=1;i< n;i++){
			  for(int target =1 ;target < =k;target++){
				  
				  boolean notTake=dp[index-1,target];
		          boolean take=false;
		          if(target >=arr[index] ){
			      taken=dp[index-1,target-arr[index]];
		          }
			  }
		  }			  
		  return dp[index-1][target];
		 }
	}
}



time complexcity : o(n* target)
space complexcity : o(n* target)

----------------------------------------------------------
//space optimization



public class Solution{
	public boolean checkequalSubset(int [] arr , int n){
		int sum=0;
		 for(int i=0;i<n;i++{
		    sum=sum+nums[i];
		 }
		 if(sum%2==1)
			 return false;
		 else{
		 int k=sum/2;
		 boolean [] prev = new boolean [k+1];
		 prev[0]=true;
		 if(arr[0]<=k)
			 prev[arr[0]]=true;
		 
		 for(int index =1 ;index <n;index++){
			 boolean[] curr= new boolean[k+1];
			 curr[0]=true;
			 for(int target=1;target<=k;target++){
				 boolean notTake=dp[index-1,target];
		          boolean take=false;
		          if(target >=arr[index] ){
			      taken=dp[index-1,target-arr[index]];
		          }
				curr[target]=notTake||taken;  
			 }
			  prev=curr;
		 }
		 return prev[k];
	}
}


time complexcity : o(n* target)
space complexcity : o(1)