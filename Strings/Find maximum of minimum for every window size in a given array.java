//Find maximum of minimum for every window size in a given array

public class Solution{
	 static int arr[] = { 10, 20, 30, 50, 10, 70, 30 };
	  
	 static void printMaxOfMin(int n){
		 for(int k=1;k<=n;k++){
			 int maxOfMin=Integer.MAX_VALUE;
			 for(i =0;i<=n-k;i++){
				 int min=arr[i];
				 for(int j=1;j<k;j++){
					 if(arr[i+j]<min){
						 min=arr[i+j];
					 }
				 }
				 if(min>maxOfMin){
					 maxOfMin=min;
				 }
			 }
			 System.out.print(maxOfMin + " ");
		 }
	 }		 
}

Time Complexity: O(n3). 
As there is a use of triple nested loop in this approach.
Auxiliary Space: O(1) 

public class Solution{
	 static void printMaxOfMin(int n){
			 for(i =0;i<=n-k;i++){
				 int max=arr[i];
				 for(int j=1;j<k;j++){
					max=Math.max(a[j],max);
				 }
				 
					System.out.print(max + " ");

			 }
	 }	
}

Time Complexity: O(n2). 
As there is a use of triple nested loop in this approach.
Auxiliary Space: O(1) 