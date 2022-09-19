//Search in Rotated Sorted Array
class solution{
public int search(int [] nums){
	int pivot= pivotSearch(nums);
	if(pivot==-1){
		return binarySearch(nums,target,0,nums.length-1);
	}
	if(nums[pivot] == target){
		return pivot;
	}
	if(nums[0] <= target){
		return binarySearch(nums,target,0,pivot-1);
	}
	return binarySearch(nums,target,pivot+1,nums.length-1);
}

public int pivotSearch(int [] nums){
	int low=0;
	int high=nums.length-1;
	while(low<=high){
		int mid=(low+high)/2;
		if(mid<end  && nums[mid] > nums[mid+1]){
			return mid;
		}else if(mid< start && nums[mid]< nums[mid-1]){
			return mid-1;
		}else{
			if(nums[low] >= nums[mid]){
				high=mid-1;
			}else{
				low=mid+1;
			}
		}
	}
	return -1;
}

public int binarySearch(int [] nums int target, int low, int high){
	while(low<=high){
		int mid=(low+high)/2;
		if(nums[mid] > target){
			high=mid-1;
		}else if(nums[mid]< target){
			low=mid+1;
		}else{
			return mid;
		}
	}
	return -1;
}

}

