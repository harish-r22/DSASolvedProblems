//valid anagram

public class Solution{
	public boolean isAnagram(String s1,String s2){
		int n=s1.length();
		if(s1.length() !=s2.length()){
			return false;
		}
		char a1[]=s1.toCharArray();
		Arrays.sort(a1);
		char a2[] =s2.toCharArray();
		Arrays.sort(a2);
		
		for(int i=0;i<n;i++){
			if(a1[i]!=a2[i]){
				return false;
			}
		}
		return true;
	}
}

time complexcity : o(nlogn)+o(n)
space complexcity : o(1)





----------------------------------------------

public class Solution{
	public boolean isAnagram(String s1,String s2){
if(s.length() != t.length())
            return false;
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < t.length(); i++)
            arr.add(t.charAt(i));
        for(int i = 0; i < s.length(); i++)
            if(arr.contains(s.charAt(i)))
                arr.remove(Character.valueOf(s.charAt(i)));
            else
                return false;
        return arr.isEmpty();
	}
}	

time complexcity : o(n)
space complexcity : o(n)
-------------------------------------------------

public class Solution{
	public boolean isAnagram(String s1,String s2){
		int [] charArray= new int[20];
		for(char c: s1.toCharArray())
			charArray[c-'a']++;
		for(char c : s2.toCharArray())
			charArray[c-'a']--;
		for(int i : charArray)
			if(i!=0)
				return false;
		
		return true;
	}
}


time complexcity : o(n)
space complexcity : o(n)






