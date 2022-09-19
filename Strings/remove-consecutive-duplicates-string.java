//remove-consecutive-duplicates-string

public class Solution{
	public String removeConsecutiveDuplicates(String s){
		if(input.length()<=1)
            return input;
        if(input.charAt(0)==input.charAt(1))
            return removeConsecutiveDuplicates(input.substring(1));
        else
            return input.charAt(0) + removeConsecutiveDuplicates(input.substring(1));
	}
}

time complexcity : o(n2)
space complexcity : o(1)


--------------------------------------------------

public class Solution{
	public String removeConsecutiveDuplicates(String s){
		 char ch[]=S.toCharArray();
        String result="";
        result+=S.charAt(0);
        for(int i=1;i<ch.length;i++){
            if(ch[i-1]!=ch[i]){
                result+=ch[i];
            }
        }
        
        return result;
	
	}
}

time complexcity : o(n)
space complexcity : o(1)