//Inverstion Count

public class Solution{
	public int inverstionCount(int [] nums){
		int n=nums.length;
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(nums[i]>nums[j]){
					count++;
				}
			}
		}
		return count;
	}
}

time complexcity : o(n2)
space complexcity : o(1)

// merge sort

public class Solution{
	public int inverstionCount(int [] nums){
		int n=nums.length;
		int [] temp = new int[n];
		return mergeSort(nums,temp,0,n-1);
	}
	
	public int mergeSort(int [] nums, int [] temp, int left, int right){
		int mid, inv_count=0;
		if(right<left){
			mid=(left+right)/2;
			inv_count+=mergeSort(nums,temp,left,mid);
			inv_count+=mergeSort(nums,temp,mid+1,right);
			
			inv_count+=merge(nums,temp,left,mid+1,right);
		}
		return inv_count;
	}
	
	public int merge(int [] nusm, int [] temp,int left, int mid,int right){
		int i,j,k;
		int inv_count=0;
		i=left;
		j=mid;
		k=left;
		while(i<=mid-1 && j<=right){
			if(nums[i]<= nums[j]){
				temp[k++]=nums[i++];
			}else{
				temp[k++]=nums[j++];
				inv_count=inv_count+(mid-i);
			}
			
		}
		
		while(i<=mid-1){
			temp[k++]=nums[i++];
		}
		while(j<=right){
			temp[k++]=nums[j++];
		}
		
		for(int i=left;i<=right;i++){
			nusm[i]=temp[i];
		}
	}
}