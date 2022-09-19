//Print all the duplicates in the input string

public class Solution{
	static final int NO_OF_CHARS = 256;
	
	private void fillCharCounts(String str,int [] count){
		for(int i=0;i<str.length();i++){
			count[str.charAt(i)]++;
		}
	}
	public void printDups(String str){
		int count[] = new int[NO_OF_CHARS];
		fillCharCounts(str,count);
		
		for(int i=0;i<count.length;i++){
			if(count[i]>1)
				System.out.println((char)(i) + 
                          ", count = " + count[i]);
		}
	}
}

time complexcity : o(n)
space complexcity : o(NO_OF_CHARS)
--------------------------------------------------

public class Solution{
		 static void printDups(String str)
            {
        HashMap<Character, Integer> count = new HashMap<>();
        /*Store duplicates present
        in the passed string */
        for (int i = 0; i < str.length(); i++) {
            if (!count.containsKey(str.charAt(i)))
                count.put(str.charAt(i), 1);
            else
                count.put(str.charAt(i),
                          count.get(str.charAt(i)) + 1);
        }
 
        /*Print duplicates in sorted order*/
        for (Map.Entry mapElement : count.entrySet()) {
            char key = (char)mapElement.getKey();
            int value = ((int)mapElement.getValue());
 
            if (value > 1)
                System.out.println(key
                                   + ", count = " + value);
          }
       }
	
}

time complexcity : o(n)
space complexcity : o(n)