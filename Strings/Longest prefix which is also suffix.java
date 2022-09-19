//Longest prefix which is also suffix

public class Solution{
	
	public int LongestPrefixSufix(String str){
		int n=str.length();
		if(n<2){
			return 0;
		}
		int len=0;
		int i= (n+1)/2;
		while(i<n){
			if(str.charAt(i) == str.charAt(len)){
				++i;
				++len;
			}else{
				i=i-len+1
				len=0;
			}
		}
		return len;
	}
}

time complexcity : o(n)
space complexcity : o(n)