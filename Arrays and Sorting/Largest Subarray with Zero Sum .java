//Largest Subarray with Zero Sum 


public class Solution{
	public int LargestSubArraySum(int [] nums){
		int n=nums.length;
		int max=0;
		for(int i=0;i<n;i++){
			int sum=nums[i];
			int count=0
			for(int j=i+1;j<n;j++){
				sum+=nums[j];
				if(sum==0){
					count=j-i;
					max=Math.max(count,max);
				}
			}
		}
		return max;
	}
}

time complexcity : o(n2)
space complexcity : o(1)

-----------------------------------------

public class Solution{
	public int LargestSubArraySum(){
		int n=nums.length;
		int max=0
		Map<Integer,Integer> map=new HashMap<>();
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=nums[i];
			if(sum==0){
				max=i+1;
			}else{
				if(map.get(sum)!=null){
					max=Math.max(max,i-map.get(sum));
				}else{
				map.put(sum,i);
				}
			}
		}
		return max;
	}
}

time complexcity : o(nlogn)
space complexcity : o(1)


-------------------------------

//Print all subarrays with 0 sum



public class Pair{
	int a,b;
	Pair(int a,int b){
		this.a=a;
		this.b=b;
	}
}

public class Solution{
	public List<Pair> findAllSubArraySumZero(int [] nums){
		int n=nums.length;
		List<Pair> out= new ArrayList<>();
		int sum=0;
		Map<Integer,List<Integer>> map=new HashMap<>();
		for(int i=0;i<n;i++){
			sum+=nums[i];
			if(sum==0){
				out.add(new Pair(0,i));
			}
			ArrayList<Integer> al= new ArrayList<>();
			if(map.containsKey(sum)){
				al=map.get(sum);
				for(int i=0;i<al.size();i++){
					out.add(new Pair(al.get(i)+1,i));
				}
			}
			al.add(i);
			map.put(sum,al);
		}
	}
}

time complexcity : o(nlogn)
space complexcity : o(n)