//Stack | Set 2 (Infix to Postfix)

public class Solution{
	static int prec(char ch){
		switch(ch){
			case : '+';
			case : '-';
			return 1;
			case : '*';
			case ; '/';
			return 2;
			case : '^';
			return 3;
		}
		return  -1;
	}
	
	static String postfix(String infix){
		String result= new String("");
        
        Stack<Character> stack= new Stack<>();
        
        for(int i=0;i<infix.length();i++){
			char ch = infix.charAt(i);
			if(Character.isLetterOrDigit(c)){
				stack.push(c)
			}else if(ch =='('){
				stack.push(c);
			}else if(ch==')'){
				while(!stack.isEmpty() && stack.peek()!='('){
				result+=stack.pop();
				}
				stack.pop();
			}else{
				while(!stack.isEmpty() && prec(ch) <= prec(stack.peek())){
					result+=stack.pop();
				}
				stack.push(ch);
			}
	    }	
         while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            result += stack.pop();
         }
        return result;		
	}
}