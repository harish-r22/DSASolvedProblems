//kth largest || smallest element in array

public class Solution{
	public static void KLargest(Integer[] arr, int k){
		Arrays.sort(arr,Collections.reverseOrder());
		for (int i = 0; i < k; i++)
            System.out.print(arr[i] + " ");
		
	}
	
	 public static ArrayList<Integer> kLargest(int[] arr, int k)
    {
        Integer[] obj_array = Arrays.stream( arr ).boxed().toArray( Integer[] :: new);
        Arrays.sort(obj_array, Collections.reverseOrder());
        ArrayList<Integer> list = new ArrayList<>(k);
 
        for (int i = 0; i < k; i++)
            list.add(obj_array[i]);
     
        return list;
    }
	
}





time complexcity : o(nlogn)

------------------------------------------------------

public class Solution{
	public static void kLargest(int arr[] , int n){
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		for(int i=0;i<n;i++){
			pq.add(arr[i]);
			if(pq.size()>k){
				pq.poll();
			}
		}
		while(!pq.isEmpty()){
			System.out.println(pq.peek() + " ");
			pq.poll();
		}
		 System.out.println();
	}
	
	public static void kSmallest(int arr[] , int n){
		PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0;i<n;i++){
			pq.add(arr[i]);
			if(pq.size()>k){
				pq.poll();
			}
		}
		while(!pq.isEmpty()){
			System.out.println(pq.peek() + " ");
			pq.poll();
		}
		 System.out.println();
	}
}


Time Complexity: O(n*log(k))
Auxiliary Space: O(k)