//Ninjas Training

public class Solution{
	public static int ninjaTraining(int [][] points, int n){
		
		return ninjaTraining(n-1, 3, points);
	}
	
	public static int ninjaTraining(int day, int last, int [][] points){
		if(day==0){
			int maxi=0;
			for(int i=0;i<=2;i++){
				if(i!=last)
				max=Math.max(maxi,points[0][i]);
			}
			return maxi;
		}
		int maxi=0;
		for(int i=0;i<=2;i++){
			if(i!=last){
				int activity = points[day][i] + ninjaTraining(day-1,i,points);
				maxi=Math.max(maxi,activity);
			}
		}
		return maxi;
	}
}

// time complexcity : o(2^4*3)
//space complexcity : o(n)

----------------------------------------------------------------------
//memoization
public class Solution{
	
	public static int ninjaTraining(int [][] points, int n){
		int [][] dp= new int [n][4];
		for(int [] row: dp)
			Arrays.fill(row,-1);
		return ninjaTraining(n-1, 3, points);
	}
	
	public static int ninjaTraining(int day, int last, int [][] points, int [][] dp){
		if(dp[day][last]!=-1){
			return dp[day][last];
		}
		if(day==0){
			int maxi=0;
			for(int i=0;i<=2;i++){
				if(i!=last)
				max=Math.max(maxi,points[0][i]);
			}
			return dp[day][last]=maxi;
		}
		int maxi=0;
		for(int i=0;i<=2;i++){
			if(i!=last){
				int activity = points[day][i] + ninjaTraining(day-1,last,points);
				maxi=Math.max(maxi,activity);
			}
		}
		return dp[day][last]=maxi;	
	}
}



Time Complexity: O(N*4*3)

Space Complexity: O(N) + O(N*4)

---------------------------------------------------------

// tabulation


public class Solution{
	public static int ninjaTraining(int [][] points, int n){
		int [][] dp= new int [n][4];
		for(int [] row: dp)
			Arrays.fill(row,-1);
		dp[0][0]=Math.max(points[0][1],points[0][2]);
		dp[0][1]=Math.max(points[0][0],points[0][2]);
		dp[0][2]=Math.max(points[0][0],points[0][1]);
		dp[0][3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
		
		for(int day=1;day<n;day++){
			for(int last =0;last<4;last++){
				dp[day][last]=0;
				for(int task=0;task<=2;task++){
					if(task!=last){
					int activity = points[day][task] + dp[day-1][task];
				    dp[day][last]=Math.max(dp[day][last],activity);
					}
				}
			}
		}
		return dp[n-1][3];
	}
}


Time Complexity: O(N*4*3)

Space Complexity:  O(N*4)
-------------------------------------------------------------


//space optimization

public class Solution{
	public static int ninjaTraining(int [][] points, int n){
		int [] prev= new int [4];
		prev[0]=Math.max(points[0][1],points[0][2]);
		prev[1]=Math.max(points[0][0],points[0][2]);
		prev[2]=Math.max(points[0][0],points[0][1]);
		prev[3]=Math.max(points[0][0],Math.max(points[0][1],points[0][2]));
		
		for(int day=1;day<n;day++){
			int temp[]= new int[4]
			for(int last =0;last<4;last++){
				temp[last]=0;
				for(int task=0;task<=2;task++){
					if(task!=last){
					int activity = points[day][task] + prev[task];
				    temp[last]=Math.max(temp[last],activity);
					}
				}
			}
			prev=temp;
		}
		return prev[3];
	}
}


