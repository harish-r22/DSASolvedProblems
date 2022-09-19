//Find if an expression has duplicate parenthesis or not


public class Solution{
	public boolean findDuplicateparenthesis(String str){
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch==')'){
				char top=stack.peek();
				stack.pop();
				int insiderLength=0;
				while(top=='('){
					top=stack.peek();
					stack.pop();
					insiderLength++;
				}
				if(insiderLength<1){
					return true;
				}
			}else{
				stack.push(ch);
			}
		}
		return false;
	}
}
	