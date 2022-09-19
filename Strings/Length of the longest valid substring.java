//Length of the longest valid substring

public class Solution{
	public int findMaxLen(String str){
		Stack<Character> stk = new Stack<>();
		int maxlength=0;
		for(int i=0;i<str.length();i++){
			String substr="";
			for(int j=i;j<str.length();j++){
				substr+=str.charAt(j);
				if(checkValid(substr)){
					maxlength=Math.max(maxlength,substr.length());
				}
			}
		}
		return maxlength;
	}
	
	public boolean checkValid(String str){
		Stack<Character> stack= new Stack<>();
		for(int i=0;i<str.length();i++){
		    char exp=str.charAt(i);
			if(exp=='(' || exp =='[' || exp=='{'){
				stack.push(str.charAt(i));
				continue;
			}
			if(stack.isEmpty())
                return false;
            char check;    
            switch(exp){
                case  ')':
                    check=stack.pop();
                    if(check == '[' || check == '{')
                        return false;
                        break;
                case '}':
                    check=stack.pop();
                    if(check=='(' || check =='[')
                    return false;
                    break;
                    
                case ']' :
                    check=stack.pop();
                    if(check=='(' || check=='{')
                    return false;
                    break;
            }     
			
			
		}
		return (stack.isEmpty());
	}
}

time complexcity : 0(n2)
space complexcity : o(n)


----------------------------------------------

public class Solution{
	public int findMaxLen(String str){
		Stack<Character> stack = new Satck<>();
		int result=0;
		for(int i=0;i<str.length;i++){
			
			if(str.charAt(i)=='('){
				stack.push(i);
			}
			
			if(!stack.isEmpty()){
				stk.pop();
			}
			if(!stack.isEmpty()){
				result=Math.max(result,i-stack.peek());
			}else{
				stack.push(i);
			}
		}
		return result;
	}
}

time complexcity : o(n)
space complexcity : o(n)
----------------------------------------------


public class Solution{
	public int findMaxLen(String str){
		Stack<Character> stack = new Satck<>();
		int maxlength=0;
		int left=0, right=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='('){
				left++;
			}else{
				right++;
			}
			
			if(right==left){
				maxlength=Math.max(maxlength,2*right);
			}else if(right>left){
				 left = right = 0;
			}
			
		}
		left= right=0;
		for(int i=str.length()-1;i>=0;i--){
			if(str.charAt(i)=='('){
				left++;
			}else{
				right++;
			}
			
				if(right==left){
				maxlength=Math.max(maxlength,2*left);
			}else if(left>right){
				 left = right = 0;
			}
			
		}
		return maxlength;
	}
}


time complexcity : o(n)
space complexcity : o(1)