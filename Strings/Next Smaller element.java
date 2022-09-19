// Next Smaller element 

public class Solution{
	public void getNextSmallest(int []  arr, int n){
		int next,i ,j;
		for(i=0;i<n;i++){
			next=-1;
			for(j=i+1;j<n;j++){
				if(arr[i] > arr[j]){
					next=arr[j];
					break;
				}
				System.out.println(arr[i]+ "  "+next);
			}
		}
	}
	public static void main(String args[])
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNSE(arr, n);
    }
}


time complexcity : o(n2)
space complexcity : o(1)

-------------------------------------------------------

//User function Template for Java

class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    Stack<Integer> stack= new Stack<>();
		int [] nge= new int[n];
		for(int i=n-1;i>=0;i--){
			while(!stack.isEmpty() && stack.peek() >= arr[i]){
				stack.pop();
			}
			if(i<n){
				if(!stack.isEmpty()){
					nge[i]=stack.peek();
				}else{
					nge[i]=-1;
				}
			}
			stack.push(arr[i]);
		}
		return nge;// Your code goes here
	} 
}

time complexcity : o(n)
space complexcity : o(n)