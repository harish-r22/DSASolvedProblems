//implement a last-in-first-out (LIFO) stack using only two queues

public class Stack{
    Queue<Integer> q1;
	Queue<Integer> q2;
	
	public stack(){
		q1=new LinkedList<>();
		q2=new LinkedList<>();
	 }
	 
	 public void push(int element){
		 if(q1.size()==0){
			 q1.offer(element);
			 while(q2.size()>0){
				 q1.offer(q2.remove());
			 }
		 }else{
			 q2.offer(element);
			 while(q1.size()>0){
				 q2.offer(q1.remove());
			 }
		 }
	 }
	 
	 public int pop(){
		 if(q1.size()>0){
           return q1.remove();
        }else if(q2.size()>0){
             return q2.remove();
        }else{
            return -1;
        }
	 }
	 
	 public int top(){
		  if(q1.size()>0){
           return q1.peek();
        }else if(q2.size()>0){
             return q2.peek();
        }else{
            return -1;
        }
	 }
	 
	  
    public boolean empty() {
        if(q1.size()>0||q2.size()>0)
        return false;
    else
        return true;
    
    }
}
