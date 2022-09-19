//Celebrity problem

public class Solution{
	  static final int N = 8;
 
  // Person with 2 is celebrity
  static int MATRIX[][] = { { 0, 0, 1, 0 },
                           { 0, 0, 1, 0 },
                           { 0, 0, 0, 0 },
                           { 0, 0, 1, 0 } };
						   
						   
	
	public int findCelebrity(){
		int [] indegree= new int[n];
		
		int [] outdegree= new int [n]; 
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				int x=knows(i,j);
				indegree[j]+=x;
				outdegree[i]+=x;
			}
		}
		
		for(int i=0;i<n;i++){
			if(indegree[i]==n-1 && outdegree[i]==0){
				return i;
			}
		}
		return -1;
	    
	}
}


time complexcity : o(n2)
space complexcity : o(1)



----------------------using stack

public class Solution{
	static int matrix[][] = { { 0, 0, 1, 0 },
                            { 0, 0, 1, 0 },
                            { 0, 0, 0, 0 },
                            { 0, 0, 1, 0 } };
 
	public int findCelebrity(int [][] matrix, int n){
		stack<Integer> stack= new Stack<>();
		for(int i=0;i<n;i++){
			stack.push(i);
		}
		while(stack.size()>1){
			int a=stack.pop();
			int b=stack.pop();
			
			if(knows(a,b)){
				stack.push(b);
		    }else{
				stack.push(a);
			}
	    }
		if(stack.isEmpty()){
			return -1;
		}
		int c=stack.pop();
		
		for(int i=0;i<n;i++){
			if(i!=c  && (knows(c,i) || !knows(c,i)) ){
				return -1;
			}
		}
		return c;
	}
	
	public boolean knows(int i, int j){
		boolean result = (matrix[i][j]==1) ? true : false;
		return result;
	}
}