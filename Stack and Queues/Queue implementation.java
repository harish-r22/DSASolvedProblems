//Queue implementation

public class Queue{
    private int arr[];
	private int front , rear;
    private int size;
	
	Queue(int size){
		arr=new int[size];
		this.size=size;
		front =-1;
		rear=-1;
	}
	
	public void enQueue(int element){
		if(isFull()){
			System.out.println("queue is full");
		}else{
			if(front==-1){
				front=0;
			}
			rear++;
			arr[rear]=item;
		}
	}
	
	public boolean isFull(){
		return (rear==size-1 && front==0);
	}
	
	public int deQueue(){
		int element;
		if(isEmpty()){
			System.out.println("queue is empty");
			return -1;
		}else{
			element=arr[front];
			if(front>=read){
				front=-1;
				rear=-1;
			}else{
				front++;
			}
		}
		System.out.println("delete"+element);
		return element;
	}
	
	public boolean isEmpty(){
		return rear==-1;
	}
	
	
	public void display(){
		if(isEmpty()){
			System.out.println("empty queue");
		}else{
			for(int i=front;i<=rear;i++){
				System.out.println(arr[i]);
			}
		}
	}
	
	public static void main(String args[]){
		Queue queue=new Queue[5];
		queue.enQueue(1);
		queue.deQueue();
		
	}
	 
}


time complexcity : o(1)