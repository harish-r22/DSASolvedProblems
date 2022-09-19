//Longest Increasing Subsequence

public class Solution{
	public int longestIncreaingSub(int [] arr){
		int n= arr.length;
		return longestIncreaingSubUtil(arr,n,0,-1);
	}
	
	public int longestIncreaingSubUtil(int [] arr,  int n , int index, int prev){
		if(index==n){
			return 0;
		}
		
		int notTake=0+longestIncreaingSubUtil(arr, n,index+1,prev);
		int take=0;
		if(prev==-1 || arr[index]>arr[prev]){
			take=1+longestIncreaingSubUtil(arr,n,index+1,index);
		}
			
		return Math.max(notTake,take);
	}
	
	
}


time complexcity : 2^n
space complexcity : o(n)
--------------------------------


public class Solution{
	public int longestIncreaingSub(int [] arr){
		int n= arr.length;
		int dp[][]=new int[n][n+1];
		for(int [] row : dp){
			Arrays.fill(row,-1);
		}
		
		return longestIncreaingSubUtil(arr,n,0,-1,dp);
	}
	
	public int longestIncreaingSubUtil(int [] arr,  int n , int index, int prev,int [][] dp){
		if(index==n){
			return 0;
		}
		
		int notTake=0+longestIncreaingSubUtil(arr, n,index+1,prev-index,dp);
		int take=0;
		if(prev==-1 || arr[index]>arr[prev]){
			take=1+longestIncreaingSubUtil(arr,n,index+1,index,dp);
		}
			
		return dp[index][prev+1]=Math.max(notTake,take);
	}
	
	
}

time complexcity : n*n
space complexcity : o(n*n) + o(n)


-------------------------------------------------------

public class Solution{
	
	public int longestIncreaingSub(int [] arr, int n){
		int dp[][]=new int[n+1][n+1];
		
		for(int index=n-1;index >=0;index--){
			for(int prev = index-1;prev > =-1;prev--){
				int notTake=0+dp[index+1][prev+1];
		        int take=0;
		        if(prev==-1 || arr[index]>arr[prev]){
			     take=1+dp[index+1][index];
		       }
			}
			dp[ind][prev_index+1] = Math.max(notTake,take);
		}
		return dp[0][0];
		
	}
}

-------------------------------------------------------------

public class SOlution{
	public int longestIncreaingSub(int [] arr, int n){
		int next[]=new int[n+1];
        int cur[]=new int[n+1];
		for(int ind = n-1; ind>=0; ind --){
        for (int prev_index = ind-1; prev_index >=-1; prev_index --){
            
            int notTake = 0 + next[prev_index +1];
    
            int take = 0;
    
            if(prev_index == -1 || arr[ind] > arr[prev_index]){
                
                take = 1 + next[ind+1];
            }
    
            cur[prev_index+1] = Math.max(notTake,take);
        }
        next = cur.clone();
    }
    
    return cur[0];
	}
	
}

