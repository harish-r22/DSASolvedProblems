//Reversing a queue using recursion

public class Solution{
	public Queue<Integer> reverse(Queue<Integer> queue ){
		 Stack<Integer> stack= new Stack<>();
		if(queue.isEmpty()){
			return queue;
		}
		while(!queue.isEmpty()){
			stack.push(queue.peek());
			queue.poll();
    	}
		
		while(!stack.isEmpty()){
			queue.add(stack.peek());
			stack.pop();
		}
		
		return queue;
	}
}

time complexcity: o(n)
space complexcity : o(n)

-----------------------------using recursion

public class Solution{
	public Queue<Integer> reverse(Queue<Integer> queue){
		Queue<Integer> que= new LinkedList<>();
		solve(queue,que);
		return que;
	}
	
	public void solve(Queue<Integer> queue1,Queue<Integer> queue2 ){
		if(queue1.isEmpty()){
			return;
		}
		int val= queue1.peek();
		queue1.poll();
		solve(queue1,queue2);
		queue2.add(val);
	}
}



	