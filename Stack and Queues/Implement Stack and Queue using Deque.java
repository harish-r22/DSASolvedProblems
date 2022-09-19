//Implement Stack and Queue using Deque

//Deque also known as double ended queue, as name suggests is a special kind of queue in which insertions and deletions can be done at the last as well as at the beginning


public class Solution{
	static class DqueNode{
		int value;
		DqueNode prev;
		DqueNode next;
	}
	static class Deque{
		private DqueNode head;
		private DqueNode tail;
		
	}
	
	public deque()
    {
        head = tail = null;
    }
	
	
	public int size(){
		if(!isEmpty()){
			DqueNode temp=head;
			int len=0;
			while(temp!=null){
				temp=temp.next;
				len++;
			}
			return len;
		}
		return 0;
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;
	}
	
	public void insert_first(int element){
		 DQueNode temp = new DQueNode();
		 temp.value=element;
		 if(head==null){
			 head=tail=temp;
			 temp.next=temp.prev=null;
		 }else{
			 head.prev=temp;
			 temp.next=head;
			 temp.prev=null;
			 head=temp;
		 }
	}
	
	public void insert_end(int element){
		DQueNode temp = new DQueNode();
		 temp.value=element;
		 if(head==null){
			 head=tail=temp;
			 temp.next=temp.prev=null;
		 }else{
			 tail.next=temp;
			 temp.prev=tail;
			 temp.next=null;
			 tail=temp;
		 }
	}
	
	public void remove_first(){
		if(!isEmpty()){
			DqueNode temp=head;
			head=temp.next;
			head.prev=null;
			return;
		}
		System.out.print("List is Empty");
	}
	
	public void remove_last(){
		if(!isEmpty()){
			DqueNode temp=tail;
			tail=tail.prev;
			tail.next=null;
			return;
		}
		System.out.print("List is Empty");
	}
	
	void display()
    {
         
        // If list is not empty
        if (!isEmpty())
        {
            DQueNode temp = head;
             
            while (temp != null)
            {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
 
            return;
        }
        System.out.print("List is Empty");
    
	}
	
	static class Stack{
		Deque stack= new Deque();

		public void push(int element){
			stack.insert_last(element);
		}
		public void pop(){
			stack.remove_last(element);
		}
		public int size(){
        
        return stack.size();
        }
	}
	
	stack class Queue{
		Deque queue= new Deque();
		public void enqueue(int element){
			queue.insert_end(element);
		}
		public void dequeue(){
			queue.remove_first();
		}
		public int size(){
        
        return queue.size();
        }
	}
	
	
	
	
	public static void main(String[] args)
{
     
    // Object of Stack
    Stack stk = new Stack();
 
    // push 7 and 8 at top of stack
    stk.push(7);
    stk.push(8);
    System.out.print("Stack: ");
    stk.display();
 
    // For new line
    System.out.println();
     
    // pop an element
    stk.pop();
    System.out.print("Stack: ");
    stk.display();
 
    // For new line
    System.out.println();
 
    // Object of Queue
    Queue que = new Queue();
 
    // Insert 12 and 13 in queue
    que.enqueue(12);
    que.enqueue(13);
    System.out.print("Queue: ");
    que.display();
 
    // New line
    System.out.println();
     
    // Delete an element from queue
    que.dequeue();
    System.out.print("Queue: ");
    que.display();
 
    // New line
    System.out.println();
    System.out.println("Size of stack is " +
                       stk.size());
    System.out.println("Size of queue is " +
                       que.size());
}
}