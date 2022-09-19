//Frog jump

public class Solution{
	
	public int minEnergy(int n, int [] heigt){
		return frogJump(n,heigt);
	}
	public int frogJump(int index, int heigt[]){
		if(index==0){
			return 0;
		}
		int onejump=frogJump(index-1,heigt)+Math.abs(heigt[index],heigt[index-1]);
		if(index>1)
		int twoJump=frogJump(index-2,heigt)+Math.abs(heigt[index],heigt[index-2]);
        return Math.min(onejump,twoJump);	
	}
	
	
}

time complexcitty: o(2^n)
space complexcitty : o(n)

// memoization

public class Solution{
	

	public int frogJump(int index, int heigt[], int [] dp){
		if(index==0){
			return 0;
		}
		if(dp[index]!=-1)
			return dp[index];
		int onejump=frogJump(index-1,heigt)+Math.abs(heigt[index],heigt[index-1]);
		if(index>1)
		int twoJump=frogJump(index-2,heigt)+Math.abs(heigt[index],heigt[index-2]);
        return dp[index]=Math.min(onejump,twoJump);	
	}
	
	public static void main(String args[]) {

       int height[]={30,10,60 , 10 , 60 , 50};
       int n=height.length;
       int dp[]=new int[n];
       Arrays.fill(dp,-1);
       System.out.println(frogJump(n-1,height,dp));
    }
	
}


time complexcitty: o(n)
space complexcitty : o(n) + o(n)


// tabulation

public class Solution{
	public static void main(String args[]) {

       int height[]={30,10,60 , 10 , 60 , 50};
       int n=height.length;
       int dp[]=new int[n];
       Arrays.fill(dp,-1);
	   dp[0]=0;
	   for(int index=1;index<n;index++){
		   int onejump=dp[index-1]+Math.abs(height[index],height[index-1]);
		   if(index>1)
		int twoJump=dp[index-2]+Math.abs(heigt[index],heigt[index-2]);
        dp[index]=Math.min(onejump,twoJump);	
	   }
	  System.out.println(dp[n-1]); 
       
	
}

time complexcity : o(n)
space complexcitty : o(n)

// space optimization

public class Solution{
	public static void main(String args[]) {

       int height[]={30,10,60 , 10 , 60 , 50};
       int n=height.length;
       int dp[]=new int[n];
       Arrays.fill(dp,-1);
	   int prev=0;
	   int prev2=0;
	   for(int index=1;index<n;index++){
		   int twoJump= Integer.MAX_VALUE;
		   int onejump=prev+Math.abs(height[index],height[index-1]);
		   if(index>1)
		 twoJump=prev2+Math.abs(heigt[index],heigt[index-2]);
        int cur=Math.min(onejump,twoJump);	
		prev2=prev;
		prev=cur;
	   }
	  System.out.println(prev); 
}

time complexcity : o(n)
space complexcitty : o(1)