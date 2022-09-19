//Arrange given numbers to form the biggest number | Set 1

public class Solution{
	public void printLargest(String [] nums){
		List<String> list=Arrays.asList(nums);
		Collection.sort(list,new Comparator<String>(){
			@overide
			public int compare(String x, String y){
				String xy=x+y;
				String yx=y+x;
				
				return xy.compareTo(yx) > 0 ? -1 : 1;
			}
		});
		Interator it=list.iterator();
		while(it.hasNext()){
			System.out.print(it.next());
		}
	}
	 public static void main(String[] args)
    {
 
        List<String> arr;
        arr = new ArrayList<>();
 
        // output should be 6054854654
        arr.add("54");
        arr.add("546");
        arr.add("548");
        arr.add("60");
        printLargest(arr);
    }
}