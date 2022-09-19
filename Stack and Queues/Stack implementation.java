///Stack implementation

public class Stack{
	private int arr[];
	private int capacity;
	private int top;
	
	stack(int size){
		arr= new int [size];
		capacity=size;
		top=-1;
	}
	
	public void push(int element){
		if(isfull()){
			System.out.println("Stack is full");
			return;
		}
		System.out.println("Inserting element");
		arr[++top]=element;
	}
	public boolean isfull(){
		return top=capacity-1;
	}
	public void pop(){
		if(isEmpty()){
		   System.out.println("Stack is empty");
           return;		   
		}
		return arr[top--];
		
	}
	public boolean isEmpty(){
		return top==-1;
	}
	public void display(){
		for(int i=0;i<top;i++){
			System.out.println(arr[top]);
		}
	}
	
	public static void main(String args[]){
		Stack stack= new Stack(5);
		stack.push(1);
		stack.pop();
		stack.display();
	}
	
}


time complexicity : o(1);