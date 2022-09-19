//Sort a stack using recursion


public class Solution {
       	public Stack<Integer> sort(Stack<Integer> stack)
	      {
       if(stack.isEmpty()){
		    return stack;
	      }
	      int x=stack.pop();
	      stack=sort(stack);
	      return sortedInsert(stack,x);
	     }
	
	public Stack<Integer> sortedInsert(Stack<Integer> stack, int x){
		  if(stack.isEmpty() || x> stack.peek()){
			  stack.push(x);
			  return stack;
		  }
		  int temp=stack.pop();
		 stack= sortedInsert(stack,x);
		  stack.push(temp);
		  return stack;
	  }
}

time complexcity : o(N2)
space complexcity : o(N)

------------------------------ without recursion

public class Solution{
	public Stack<Integer> sort(Stack<Integer> s){
	 Stack<Integer> s1 = new Stack<>();
	 while(!s.isEmpty()){
		 if(s1.isEmpty()){
			 s1.push(s.pop());
		 }else if(s.peek() >= s1.peek()){
			 s1.push(s.pop());
			 
		 }else if(s1.peek() > s.peek()){
			 int temp=s.pop();
			 while(s1.isEmpty()==false || s1.peek()> temp ){
				 s.push(s1.pop());
			 }
			 s1.push(temp);
		 }
	 }
     return s1;
   }
}

time complexcity : o(N2)
space complexcity : o(N)
