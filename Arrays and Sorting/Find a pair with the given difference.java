//Find a pair with the given difference


public class Solution{
	public boolean findpair(int nums[], int x){
		int n=nums.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(nums[i]==x+nums[j] || nums[j]== x+nums[i]){
					return true;
				}
			}
		}
		return false
	}
}

time complexcity : o(n2)
space complexcity : o(1)

public class Solution{
	public boolean findpair(int nums[], int x){
		int n=nums.length;
		Arrays.sort(nums);
		for(int i=0;i<n-1;i++){
		int y=x+nums[i];
		int low=i+1; 
		int high=nums.length-1;
		while(low<=high){
		    int mid=(low+high)/2;
			if(nums[mid]==y){
					return true;
			}else if(nums[mid]>y){
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		}
		return false;
	}
}

time complexcity : o(nlogn)
space complexcity : o(1)


public class Solution{
	public boolean findpair(int nums[], int x){
		int n=nums.length;
		int i=0, j=1;
		Arrays.sort(nums);
		while(i<n && j<n){
			if(i!=j && (nums[i]==x+nums[j] || nums[j]== x+nums[i])){
					return true;
			}else if(nums[j]-nums[i]<x ){
				j++;
			}else{
				i++;
			}
			
		}
		return false;
	}
}


time complexcity : o(nlogn)
space complexcity : o(1)

public class Solution{
	public boolean findpair(int [] nums, int x){
		int n=nums.length;
		Map<Integer,Integer> map= new HashMap<>();
		for(int i=0;i<n;i++){
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
			if(x==0 && map.get(nums[i])>1){
				return true;
			}
		}
		if (n == 0)
        return false;
		for(int i=0;i<n;i++){
			if(map.containsKey(x+nums[i])){
				return true;
			}
		}
		return false;
	}
}


time complexcity : o(n)
space complexcity : o(n)