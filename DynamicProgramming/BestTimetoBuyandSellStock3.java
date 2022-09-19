// Best Time to Buy and Sell Stock !!  we buy ans sell only 2 no times

public int maximumProfit(int nums[]){
	int n=nums.length;
	return maximumProfit(n,1,nums,2);
}
public int maximumProfit(int index,int buy,int cap, int [] nums){
	if(index==nums.length){
		return 0;
	}
	if(cap==0){
		return 0;
	}
	if(buy==1){
		return Math.max(-nums[index] + maximumProfit(index+1,0,cap,nums, 0+maximumProfit(index+1,1,cap,nums));
	 }
		return Math.max(numsp[index]+maximumProfit(index+1,1,cap-1,nums, 0+ maximumProfit(index+1,0,cap,nums));
	 
}


// memoization
public int maximumProfit(int nums[]){
	int n=nums.length;
	int [][][] dp= new int[n][2][3];
	return maximumProfit(n,1,nums,2,dp);
}
public int maximumProfit(int index,int buy,int cap, int [] nums,int [][][] dp){
	if(index==nums.length){
		return 0;
	}
	if(cap==0){
		return 0;
	}
	if(dp[index][buy][cap]!=-1){
		return dp[index][buy][cap];
	}
	if(buy==1){
		return dp[index][buy][cap]= Math.max(-nums[index] + maximumProfit(index+1,0,cap,nums), 0+maximumProfit(index+1,1,cap,nums));
	   }
		return dp[index][buy][cap]= Math.max(numsp[index]+maximumProfit(index+1,1,cap-1,nums0), 0+ maximumProfit(index+1,0,cap,nums));
	
}


// tabulation

public int maximumProfit(int [] nums){
	int n=nums.length;
	int [][][] dp= new int[n][2][3];
	if(cap==0){
		for(int index=0;index<n-1;index++){
			for(int buy=0;i<=1;buy++ ){
				dp[index][buy][cap]=0;
			}
		}
	}
	if(index==n){
		for(int buy=0;buy<=1;buy++){
			for(int cap=0;i<=2;cap++ ){
				dp[index][buy][cap]=0;
			}
		}
	}
	for(int index=n-1;i>=0;i--){
		for(int buy=0;buy<=1;buy++){
			for(int cap=0;i<=2;cap++ ){
	if(buy==1){
		 dp[index][buy][cap]= Math.max(-nums[index] + dp[index+1][0][cap], 0+dp[index+1][1][cap]);
	   }else{
		 dp[index][buy][cap]= Math.max(numsp[index]+dp[index+1][1][cap-1], 0+ dp[index+1][0][cap]);
	   }
			}
		}
	}
	return dp[0][1][2];
}


// space optimization

public int maximumProfit(int [] nums){
	int n=nums.length;
	int [][] after= new int[2][3];
	int [][] cur= new int[2][3];
	if(cap==0){
		for(int index=0;index<n-1;index++){
			for(int buy=0;i<=1;buy++ ){
				dp[index][buy][cap]=0;
			}
		}
	}
	if(index==n){
		for(int buy=0;buy<=1;buy++){
			for(int cap=0;i<=2;cap++ ){
				dp[index][buy][cap]=0;
			}
		}
	}
	for(int index=n-1;i>=0;i--){
		for(int buy=0;buy<=1;buy++){
			for(int cap=0;i<=2;cap++ ){
	if(buy==1){
		 cur[buy][cap]= Math.max(-nums[index] + after[0][cap], 0+after[1][cap]);
	   }else{
		 cur[buy][cap]= Math.max(numsp[index]+after[1][cap-1], 0+ after[0][cap]);
	   }
			}
		}
		after=cur;
	}
	return dp[0][1][2];
}
