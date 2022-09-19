//Design and Implement Special Stack Data Structure | Added Space Optimized Version

//Question: Design a Data Structure SpecialStack that supports all the stack operations like push(), pop(), isEmpty(), isFull() 
//and an additional operation getMin() which should return minimum element from the SpecialStack. 
//All these operations of SpecialStack must be O(1). 
//To implement SpecialStack, you should only use standard Stack data structure and no other data structure like arrays, list, . etc. 

public class SpecialStack extends Stack<Integer>{
	Stack<Integer> min=new Stack<>();
	public void push(int element){
		if(isEmpty()==true{
			super.push(element);
			min.push(element);
		
	    }else{
			super.push(element);
			int y=min.pop();
			if(element < y){
				 min.push(element);
			}else{
				min.push(y);
			}
		}
	}
	
	public Integer pop(){
		int x=super.pop();
		min.pop()
		return x;
	}
	
	public Integer getMin(){
		int x=min.peek();
		return x;
	}
	
	public static void main(String[] args)
    {
        SpecialStack s = new SpecialStack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
}


time complexcity : o(1);
space complexcity : o(n);










----------------------------------------------------

public class SpecialStack{
	int min=-1;
	static int demval=999;
	Stack<Integer> stack= new Stack<Ineteger>();
	
	public void getMin(){
		System.out.println("minimum element"+ min);
	}
	public void push(int val){
     if(stack.isEmpty() || val<min ){
		 min=val;
	 }		 
	 stack.push(val * demval + min);
	 System.out.println("pushed: " + val);
	}
	public int pop(){
		if(stack.isEmpty()){
			 System.out.println("stack underflow"); 
               return -1;
		}
		int val=stack.pop();
		if(!stack.isEmpty())
		int min=stack.peek()%demval;
	     else
			 min=-1;
		 return val/demval;
	}
	 int peek()
    {
        return st.peek() / demoVal; // decode actual value
                                    // from encoded value
    }
	
	public static void main(String[] args)
    {
        SpecialStack s = new SpecialStack();
  
        int[] arr = { 3, 2, 6, 1, 8, 5, 5, 5, 5 };
  
        for (int i = 0; i < arr.length; i++) {
            s.push(arr[i]);
            s.getMin();
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            s.pop();
            s.getMin();
        }
    }
}