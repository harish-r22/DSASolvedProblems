//Find the maximum repeating number in O(n) time and O(1) extra space

public class Solution{

    public int findmaxNum(int [] arr){
	int max=0;
	int n =arr.length;
	int index=-1;
	for(int i=0;i<n;i++){
	   int count=0;
	  for(int j=0;j<n;j++){
	     if(arr[i]==arr[j])
		   count++;
	     if(count>max){
			 count=max;
			 index=i;
		 }
	  }  
	}
	return arr[i];
	}

}


time complexcity : o(n2)
space complexcity : o(1)
----------------------------------------------------------------


public class Solution{
	
	public int maxRepeating(int arr[], int n, int k){
		for(int i=0;i<n;i++){
			arr[arr[i%k]]+=k;
			
		}
		int max=arr[0], result=0;
		for(int i=0;i<n;i++){
			if(arr[i]>max){
				max=arr[i];
				result=i;
			}
		}
		return result;
	}
}


time complexcity : o(n)
space complexcity : o(1)