//Grouping Anagram

public class Solution{
 public List<List<String>> groupingAnaGram(String [] str){
 HashMap<String ,ArrayList<String>> hash= new HashMap<>();
 int i=0;
 while(i<str.length){
   char[] temp=str[i].toCharArray();
   Arrays.sort(temp);
   String s= new String(temp);
   if(!hash.containsKey(s))
   hash.put(s,new ArrayList<String>());
   
   hash.get(s).add(str[i]);
   i++;
 }
 return new ArrayList<List<String>>(hash.values());
 }

}