//Valid Palindrome

public class SOlution{
	
	public boolean checkPalindrome(String str){
		int n =str.length();
		String sb="";
		for(int i=n-1;i>=0;i--){
			sb += str.charAt(i);
		}
        System.out.println(sb);
		if(str.equals(sb)){
            System.out.println(sb);
			return true;
		}
		return false;
	}
}

brute force approach

time complexcity : o(n2)
space complexcity : o(n)

-----------------------------------------------------------

public class Solution{
	public boolean checkPalindrome(String str){
		 int n= str.length();
		StringBuilder sb= new StringBuilder();
		for(char ch : str.toCharArray()){
			if(Character.isLetterOrDigit(ch)){
				sb.append(Character.toLowerCase(ch));
			}
		}
		str=sb.toString();
		int left=0;
		int right=str.length()-1;
		while(left<right){
			if(str.charAt(left++)!=str.charAt(right--)){
				return false;
			}
		}
		return true;
	}
}


time complexcity : o(n)
space complexcity : o(n)

isbuilt function 


--------------------------------------

public class Solution{
	public boolean checkPalindrome(String str){
		if(str==null || str=="")
			return true;
		int l=str.length();
		int r=0;
		int i=0, j=l-1;
		while(i<j){
			while(i<l && !isAlphaOrNum(str.charAt(i)))
				i++;
			while(j>-1 && !isAlphaOrNum(str.charAt(j)))
				j--;
			
			if(i>=j)
				break;
			char c1= str.charAt(i);
			char c2=str.charAt(j);
			if(c1==c2 || (isAlpha(c1) && isAlpha(c2) && Math.abs(c1-c2)=='a' -'A')){
				i++;
				j--;
			}else{
				return false;
			}
		}
		return true;
	}
	
	private boolean isAlphaOrNum(char c){
		return (isAlpha(c) || (c>='0' || c<='9'));
	}
	private boolean isAlpha(char c){
		return (c>='a' && c<='Z') || (c>='A' && c<='Z');
	}
}

time complexcity : o(n)
space complexcity : o(1)