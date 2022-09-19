//Make all array elements equal with minimum cost

public class Solution{
	public int minCostToMakeElementEqual(int [] nums){
		int n=nums.length;
		int y;
		int s=0;
		if(n%2==1){
			y=nums[n/2];
		}else{
			y=(nums[n/2] + nums[(n-2)/2)]/2;
		}
		for(int i=0;i<n;i++){
			s+=Math.abs(nums[i]-y);
		}
		return s;
		
	}
}