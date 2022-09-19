//Find the smallest window in a string containing all characters of another string

public class Solution{
	
	public String windowContainingAllChar(String str,String pattern){
		HashMap<Character, Integer> map= new HashMap<>();
		int matchingeeEleCount=0;
		int minSubStringLen=Integer.MAX_VALUE;
		int minSubStringStart=0;
		int start=0;
		
		for(int i=0;i<pattern.length();i++){
			map.put(pattern.charAt(i),map.getOrDefault(pattern.charAt(i),0)+1);
    	}
		
		for(int end=0;end<str.length();end++){
			char curentChar=str.charAt(end);
			if(map.containsKey(curentChar)){
				map.put(curentChar,map.get(curentChar)-1);
				
				if(map.get(curentChar)>=0){
					matchingeeEleCount++;
				}
			}
			
			while(matchingeeEleCount == pattern.length()){
				if(end-start+1 < minSubStringLen){
					minSubStringLen=end-start+1;
					minSubStringStart=start;
				}
				char charAtStart=str.charAt(start++);
                  
                  if(map.containsKey(charAtStart)){
					  if(map.get(charAtStart)==0){
						  matchingeeEleCount--;
					  }
					  map.put(charAtStart , map.get(charAtStart)+1);
				  }
                   				  
			}
			
		}
		if(minSubStringLen > str.length()){
			return "";
		}
		return str.substring(minSubStringStart,minSubStringStart+minSubStringLen);
	}
}

time complexcity : o(k + n^2)
space complexcity : o(k)