//Stack Permutations (Check if an array is stack permutation of other)

public class Solution{
	public boolean checkStackPermutation(int [] input , int [] output ,int n){
		Queue<Integer> inputQ= new LinkedList<>();
		for(int i=0;i<n;i++){
			inputQ.add(input[i]);
		}
		
		Queue<Integer> outputQ= new LinkedList<>();
		for(int i=0;i<n;i++){
			outputQ.add(output[i]);
		}
		Stack<Integer> stack = new Stack<>();
		while(!inputQ.isEmpty()){
			int ele = inputQ.poll();
			if(ele == outputQ.peek()){
				outputQ.poll();
				while(!stack.isEmpty()){
					if(stack.peek() == outputQ.peek()){
						stack.pop();
						outputQ.poll();
					}else{
						break;
					}
					
				}
			}else{
				stack.push(ele);
			}
		}
		return (stack.isEmpty() && inputQ.isEmpty());
	}
}	