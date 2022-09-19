//Reverse first k elements of queue

public class Solution{
	public Queue<Integer> reverse(Queue<Integer> queue , int k){
		Stack<Integer> stack= new Stack<>();
		if(queue.isEmpty() || k==0){
			return queue;
		}
		for(int i=0;i<k;i++){
			stack.push(queue.peek());
			queue.poll();
		}
		while(!stack.isEmpty()){
			queue.add(stack.top());
			stack.pop();
		}
		
		for(int i=0;i<queue.size()-k;i++){
			queue.add(queue.front());
			queue.poll();
		}
		return queue;
	}
}

