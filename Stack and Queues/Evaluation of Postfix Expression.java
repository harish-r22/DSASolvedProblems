//Stack | Set 4 (Evaluation of Postfix Expression)


public class Solution{
	public int evaluatePostfix(String exp){
		Stack<Integer> stack = new Stack<>();
		for(int i=0;i<exp.length;i++){
			char c= exp.charAt(i);
			
			if(Character.isDigit()){
				stack.push(c -'0');
			}
			else{
				int val1=stack.pop();
				int val2=stack.pop();
				
				switch(c){
					case '+':
					stack.push(val1+val2);
					break;
					
					case '-':
					stack.push(val1-val2);
					break;
					
					case '/':
                    stack.push(val2/val1);
                    break;
                      
                    case '*':
                    stack.push(val2*val1);
                    break;
				}
			}
		}
		return stack.pop();
	}
}