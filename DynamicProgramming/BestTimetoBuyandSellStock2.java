// Best Time to Buy and Sell Stock !! 2 we buy ans sell any no times


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
		profit=Math.max(nums[index]+maximumProfit(index+1,1,nums,n),0+maximumProfit(index+1,0,nums,n));
	}
	return profit;
}

// memoization

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
		profit=Math.max(nums[index]+maximumProfit(index+1,1,nums,n,dp),0+maximumProfit(index+1,0,nums,n,dp));
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
		     profit=Math.max(nums[index]+dp[index+1][1],0+dp[index+1][0]);
	         }
	         dp[index][buy]=profit;
		}
	}
	return dp[0][1];
}

// space optimization

public int maximumProfit(int [] nums){
	int n= nums.length;
	int [] ahead= new int[2];
	int [] cur= new int [2];
	dp[0]=dp[1]=0;
	for(int index=n-1;i>=0;i--){
		for(int buy=0;buy<=1;buy++){
			long profit=0;
	         if(buy==1){
		     profit=Math.max(-nums[index]+ahead[0],0+ahead[1]);
	         }else{
		     profit=Math.max(nums[index]+ahead[1],0+ahead[0]);
	         }
	         cur[buy]=profit;
		}
		ahead=cur;
	}
	return ahead[ 1];
}

// using variables

public int maximumProfit(int [] nums){
	int n= nums.length;
	long aheadBuy,aheadNotBuy,curBuy,curNotBuy;
	aheadNotBuy=aheadBuy=0;
	for(int index=n-1;i>=0;i--){
			long profit=0;
	        
		     curBuy=Math.max(-nums[index]+aheadNotBuy,0+aheadBuy);
	       
		     curNotBuy=Math.max(nums[index]+aheadBuy,0+aheadNotBuy);
		
		aheadBuy=curBuy;
		aheadNotBuy=curNotBuy;
	}
	return aheadBuy;
}