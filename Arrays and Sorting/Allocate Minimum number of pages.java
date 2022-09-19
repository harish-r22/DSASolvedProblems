//Allocate Minimum number of pages


class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]nums,int N,int M)
    {
        int low=Integer.MAX_VALUE;
        int high=0;
        
        for(int i=0;i<N;i++){
            low=Math.min(low,nums[i]);
            high+=nums[i];
        }
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(isFeasiable(nums,N,M,mid)){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
        
    }
    
    public static boolean isFeasiable(int [] nums, int n, int student,int barrier){
        int pages=0;
       int allocateStudent=1;
       for(int i=0;i<n;i++){
           if(nums[i]<barrier)
           return false;
           if(pages+nums[i]>barrier){
               allocateStudent++;
               pages=0;
           }
           pages+=nums[i];
       }
       return (allocateStudent<=student);
    }
};


time complexcity : o(nlogn)
space complexcity : o(1)