//K’th Smallest/Largest Element in Unsorted Array |

public class Solution{
	public int kthSmallest(int [] nums,int k){
		Arrays.sort(nums);
		return nums[k-1];
	}
}

time complexcity : o(nlogn)

public class Solution{
	public int kthLargest(int [] nums,int k){
		Arrays.sort(nums);
		return nums[nums.length - k]
	}
}

time complexcity : o(nlogn)

optimised approch

------------//using TreeMap

7,0,25,6,16,17,0
0,0,6,7,16,17,25

public class Solution{
	public int kthLargest(int [] nums,int k){
		TreeMap<Integer,Integer> map= new TreeMap<>();
		for(int i=0;i<n;i++){
			map.put(nums[i].map.getOrDefault(nums[i],0)+1);
		}
		int freq=0;
		for(Map.Entry<Integer,Integer> map: map.entrySet()){
			freq+=map.getValue();
			if(freq>=k){
				return map.getKey();
			}
		}
		return -1;
	}
}


//time complexcity: o(n)
space complexcity:o(n)


---------------- heap sort

class MinHeapComparator implements Comparator<Integer>{
	@overide
	public int compare(Integer number1, Integer number2){
		int value = number1.compareTo(number2);
		if (value > 0) {
            return -1;
        }
        else if (value < 0) {
            return 1;
        }
        else {
            return 0;
        }
	}
}

class Solution{
	public int kthLargest(int nums[], int k){
		PriorityQueue<Integer> queue= new PriorityQueue<>(new MinHeapComparator());
		for(int i=0;i<nums.length;i++){
			queue.add(nums[i]);
			
			if(queue.size()>k){
				queue.remove();
			}
		}
		return queue.peek();
	}
}

time complexity : o(n)
space complexcity:o(n)

-----------------Binary search

class Solution {
	public int count(int [] nums, int mid){
		int count=0;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<=mid){
				count++;
			}
		}
		return count;
	}		
	public int kthLargest(int nums[], int k ){
		int n=nums.length;
		int low=Integer.MAX_VALUE;
		int high=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++){
			low=Math.min(low,nums[i]);
			high=Math.max(high,nums[i]);
		}
		while(low<high){
			int mid=(low+(high-low))/2;
			if(count(nums,mid)<k){
				high=mid+1
			}else{
				low=mid;
			}
		}
		return low;
	}
}








