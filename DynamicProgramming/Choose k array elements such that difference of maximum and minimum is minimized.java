//Choose k array elements such that difference of maximum and minimum is minimized

public class Solution{
	
	public static int minDiff(int [] arr, int k){
	   int result = Integer.MAX_VALUE;
 
 
        Arrays.sort(arr);
		
		for(int i=0;i<=n-k;i++){
			result=Math.min(result, (arr[i+k-1]-arr[i]));
		}
		return result;
	}

}

time complexcity : nlogn