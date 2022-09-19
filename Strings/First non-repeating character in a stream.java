//First non-repeating character in a stream

public class Solution{
	int static max_count=26;
	public String firstNonRepeating(String str){
		int [] count= new int [max_count];
		String result="";
		Queue<Character> queue= new LinkedList<>();
		for(int i=0;i<str.length();i++){
			int ch=str.charAt(i);
			queue.add(ch);
			count[ch-'a']++;
			while(!queue.isEmpty()){
				if(count[queue.peek()-'a'] > 1){
					queue.remove();
				}else{
					result+=queue.peek();
					break;
				}
			}
			if(queue.isEmpty()){
				result+="-1";
			}
		}
		return result;
	}
}	


time complexcity : o(n)
sapce complexcity : o(n)