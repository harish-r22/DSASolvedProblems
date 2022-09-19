//Length of the longest substring without repeating characters

public class Solution{
	
	private boolean isDistinct(int i, int j, String str){
		boolean[] visited = new boolean[26];
		for(int k=i;k<=j;k++){
			if(visited[str.charAt(k)-'a']==true)
				return false;
			visited[str.charAt(k)-'a']=true;
		}
		return true;
	}
	
	public int longestSubStringLen(String str){
		int n=str.length;
		int res=0;
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(isDistinct(i,j,str))
					res=Math.max(res,j-i+1);
			}
		}
		return res;
	}
}

Time Complexity: O(n^3)
Auxiliary Space: O(1)


----------------------------------------------------------------------

public class Solution{
	
	public boolean longestSubStringLen(String str){
		int n=str.length;
		for(int i=0;i<n;i++){
			boolean[] visited = new boolean[256];
			for(int j=i;j<n;j++){
				if(visited[str.charAt(j)]==true)
					return false;
				else{
				visited[str.charAt(j)]=true;
				res=Math.max(res,j-i+1);
				}
			}
			visited[str.charAt(j)]=false;
				
		}
		return res;
	}
}


Time Complexity: O(n^2)


Auxiliary Space: O(no_chars)


------------------------------------------------------

public class Solution{
	public int longestSubStringLen(String str){
		int n=str.length;
		int right=0,left=0;
		int res=0;
		HashMap<Character,Integer> map= new HashMap<>();
		while(right<n){
			if(map.containsKey(str.charAt(right)))
				left=Math.max(map.get(str.charAt(rihgt))+1,left);
			map.put(str.charAt(right)),right);
			res=Math.max(res,(right-left+1));
			right++;
		}
		return res;
	}
}

Time Complexity: O(n)


Auxiliary Space: O(n)

----------------------------------------------------------

public class Solution{
	
	public int longestSubStringLen(Sring str){
		String test="";
		int res=0;
		 if (str.isEmpty()) {
            return 0;
        }else if(str.length()==1){
			return 1;
		}
		for(char c : str){
			String current = String.valueOf(c);
			if(test.contains(current)){
				test=test.substring(test.indexOf(current)+1);
			}
			test=test+String.valueOf(c);
			len=Math.max(len,test.length());
		}
		return res;
	}
}

Time Complexity: O(n)

Auxiliary Space: O(1)
-----------------------------------------------------