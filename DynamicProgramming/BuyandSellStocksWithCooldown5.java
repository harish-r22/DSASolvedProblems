//Buy and Sell Stocks With Cooldown 
public int maximumProfit(int [] nums){
	int n=nums.length;
	return maximumProfit(0,1,nums,n);
}
public int maximumProfit(int index,int buy,int [] nums,int n){
	if(index==n){
		return 0;
	}
	long profit=0
	if(buy==1){
		profit=Math.max(-nums[index]+maximumProfit(index+1,0,nums,n),0+maximumProfit(index+1,1,nums,n));
	}else{
		profit=Math.max(nums[index]+maximumProfit(index+2,1,nums,n),0+maximumProfit(index+1,0,nums,n));
	}
	return profit;
}

//memoization

public int maximumProfit(int [] nums){
	int n=nums.length;
	int [][] dp= new int [n][2];
	for(int [] r: dp){
		Arrays.fill(r,-1);
	}
	return maximumProfit(0,1,nums,n,dp);
}
public int maximumProfit(int index,int buy,int [] nums,int n,int [][] dp){
	if(index==n){
		return 0;
	}
	long profit=0;
	if(dp[index][buy]!=-1){
		return dp[index][buy];
	}
	if(buy==1){
		profit=Math.max(-nums[index]+maximumProfit(index+1,0,nums,n,dp),0+maximumProfit(index+1,1,nums,n,dp));
	}else{
		profit=Math.max(nums[index]+maximumProfit(index+2,1,nums,n,dp),0+maximumProfit(index+1,0,nums,n,dp));
	}
	return dp[index][buy]=profit;
}


// tabulation

public int maximumProfit(int [] nums){
	int n= nums.length;
	int [][] dp= new int [n+1][2];
	dp[n][0]=dp[n][1]=0;
	for(int index=n-1;i>=0;i--){
		for(int buy=0;buy<=1;buy++){
			long profit=0;
	         if(dp[index][buy]!=-1){
		     return dp[index][buy];
	         }
	         if(buy==1){
		     profit=Math.max(-nums[index]+dp[index+1][0],0+dp[index+1][1]);
	         }else{
		     profit=Math.max(nums[index]+dp[index+2][1],0+dp[index+1][0]);
	         }
	         dp[index][buy]=profit;
		}
	}
	return dp[0][1];
}
// space optimize

public int maximumProfit(int [] nums){
	int n= nums.length;
	int [][] dp= new int [n+1][2];
	dp[n][0]=dp[n][1]=0;
	for(int index=n-1;i>=0;i--){
		     dp[index][1]=Math.max(-nums[index]+dp[index+1][0],0+dp[index+1][1]);
		     dp[index][0]=Math.max(nums[index]+dp[index+2][1],0+dp[index+1][0]);
	}
	return dp[0][1];
}

public int maximumProfit(int [] nums){
	int n= nums.length;
	int [] front1= new int [2];
	int [] front2= new int [2];
	int [] curr= new int [2];
	front1[0]=front1[1]=0;
	for(int index=n-1;i>=0;i--){
		     curr[1]=Math.max(-nums[index]+front1[0],0+front1[1]);
		     curr[0]=Math.max(nums[index]+front2[1],0+front1[0]);
			 front2=front1;
			 front1=curr;
	}
	return curr[1];
}