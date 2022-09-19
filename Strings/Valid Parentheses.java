// Valid Parentheses



public class Solution{
public boolean isValidParenthisis(String s){
Stack <Character> ans = new Stack();
        for(char c : s.toCharArray()){
            if(c == '{'){
                ans.push('}');
            }
            else if(c == '('){
                ans.push(')');
            }
            else if(c == '['){
                ans.push(']');
            }
            else if(ans.isEmpty() || ans.pop() != c){
                return false;
                }
        }
        return ans.isEmpty();
    }
}

time coplexcity : o(n)
space coplexcity : o(n)