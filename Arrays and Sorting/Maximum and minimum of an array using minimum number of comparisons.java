Maximum and minimum of an array using minimum number of comparisons

SDE SHEET 1


Write a  function to return minimum and maximum in an array. Your program should make the minimum number of comparisons.



class solution{
	static class Pair{
		int min;
		int max;
	}
	
	public static Pair getMinMax(int [] nums, int n){
		Pair pair= new Pair();
		if(n==1){
			if(nums[0]>nums[1]){
				pair.max=nums[0];
				pair.min=num[1];
			}else{
				pair.max=nums[1];
				pair.min=num[0];
			}
		}else{
			// nums length greater than zero
			if(nums[0]>nums[1]){
				pair.max=nums[0];
				pair.min=num[1];
			}else{
				pair.max=nums[1];
				pair.min=num[0];
			}
			
			for(int i=2;i< n;i++){
				if(nums[i] > pair.max){
					pair.max=nums[i];
				}else if(nums[i]< pair.min){
					pair.min=nums[i];
				}
			}
		}
		return pair;
	}
	
	public static void main(){
		int [] nums= new int[]{1000, 11, 445, 1, 330, 3000};
		int n=nums.length;
		Pair minMax=getMinMax(nums,n);
		System.out.println("greater number in array:"+ minMax.max);
		System.out.println("smaller number in array:"+ minMax.min);
	}
}

time complexity : O(n)
space complexity : o(1)








--------------------------------------

using recursion

public static Pair getMinMax(int [] nums , int low , int high){
	Pair result= new Pair();
	Pair lrp= new Pair();
	Pair rrp= new Pair();
	
	if(low==high){
		result.max=nums[low];
		result.min=nums[high];
		return result;
	}
	if(low=high+1){
		if(nums[low]>nums[high]){
			result.max=nums[low];
			result.min=nums[high];
		}else {
			result.max=nums[high];
			result.min=nums[low];
		}
		return result;
	}
	
	int mid = (low + high) /2;
	lrp=getMinMax(nums,low,mid);
	rrp=getMinMax(nums,mid+1,high);
	if(lrp.min < rrp.min){
		result.min=lrp.min;
	}else{
		result.min=rrp.min;
	}
	
	if(lrp.max> rrp.max){
		result.max=lrp.max;
	}else{
		result.max=rrp.max;
	}
	
	return result;
}