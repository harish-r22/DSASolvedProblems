//Top K Frequent Elements

public class Solution{
	
	public int[] getMostFrequentEle(int [] arr, int n , int k){
		int [] result= new int[n];
		Map<Integer, Integer> mp
            = new HashMap<Integer, Integer>();
			for(int i=0;i<n;i++){
				map.put(arr[i],map.getOrDefault(arr[0],0)+1);
			}
			List<Map.Entry<Integer, Integer>> list= new ArrayList<Map.Entry<Integer,Integer>>(map.entrySet());
			Collection.sort(list, new Comparator<Map.Entry<Integer,Integer>>(){
				public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
					if(o1.getValue()==o2.getVale)
						 return o2.getKey() - o1.getKey();
					 else
						  return o1.getKey() - o2.getKey();
				}
			});
			
			for (int i = 0; i < k; i++)
				result[i]=list.get(i).getKey();
            System.out.println(list.get(i).getKey());
			return result;
	}
}