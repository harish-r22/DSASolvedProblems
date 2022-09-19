//Next Greater element

public class Solution{
   public int[] findNextGreaterElement(int [] arr , int n){
	   
       long [] nge= new long[n];
	   for(int i=0;i<=2*n-1;i++){
		   for(int j=i+1;j<=2*n-1;j++){
			   if(arr[j%n] > arr[i%n]){
				   nge[i%n]=arr[j%n];
				   break;
			   }
		   }
             if(nge[i%n]==0){
				 nge[i%n]=-1;
			 }
		   
	   }
	   return nge;
   }
}

time complexity: o(n2)
space complexity : o(n)

---------------------------------------------------------

public class Solution{
	public int[] findNextGreaterElement(int [] arr,int n){
		Stack<Integer> stack= new Stack<>();
		int [] nge= new int[n];
		for(int i=0;i<=2*n-1;i++){
			while(!stack.isEmpty() && stack.top < =arr[i%n]){
				stack.pop();
			}
			if(i<n){
				if(!stack.isEmpty()){
					nge[i]=stack.top();
				}else{
					nge[i]=-1;
				}
			}
			stack.push(arr[i%n]);
		}
		return nge;
	}
}


time complexity: o(n)
space complexity : o(n)



