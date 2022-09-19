product of array except self


public class SOlution{
     public int[] generateArray(int [] nums){
		 
		 int n= nums.length;
		 for(int i=0;i<n;i++){
			 int multiply=1
			 for(int j=0;j<n;j++){
				 if(i==j){
					 continue;
				 }
				multiply *=nums[j];  
				 
			 }
			 
			nums[i]=multiply 
		 }
		 return nums;
	 }		 
}


public class Solution{
	
	public int[] generateArray(int [] nums){
		int n=nums.length;
	    int left[]= new int[n];
        for(int i=0;i<n;i++){
			if(i==0){
				left[i]=nums[i];
			}else{
				left[i]=nums[i]*left[i-1];
			}
		}

        for(int i=n-1;i>=;i--){
			if(i==n-1){
				right[i]=nums[i];
			}else{
				right[i]=nums[i]*right[i+1];
			}
			
		}
        int output[]= new int[n];
        for(int i=1;i<n-1;i++){
            output[i]=left[i-1]*right[i+1];	
		}			
	    output[0]=right[1];
		output[n-1]=left[n-2];
		return nums;
	}
	
}