//climbing stairs


// sapace optimization
public class Solution{

   public int climbingStairs(int n){
	   int prev1=0;
	   int prev=1;
	   for(int i=2;i<=n;i++){
		   int curri=prev+prev1;
		   prev1=prev;
		   prev=curri
	   }
	   return prev;
   }
}

time complexcity : o(n)
space complexcity : o(1)