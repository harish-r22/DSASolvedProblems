// Best Time to Buy and Sell Stock

public int maximumProfit(int [] num){
	int mini=num[0],profit=0;
	for(int i=1;i<num.length;i++){
		cost= num[i]-mini;
		profit=Math.max(cost,profit);
		mini=Math.mini(mini,num[i]);
	}
	return profit;
}