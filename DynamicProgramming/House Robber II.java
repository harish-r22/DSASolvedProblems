//House Robber II


import java.util.ArrayList;
public class Solution {
	public static long houseRobber(int[] arr) {
		int n=arr.length;
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
         if(n==1)
        return arr[0];
        for(int i=0;i<n;i++){
            if(i!=0)
            list1.add(arr[i]);
            if(i!=n-1)
             list2.add(arr[i]);    
        }
        long x=maxSumofNonAdjascentele(list1);
        long y=maxSumofNonAdjascentele(list2);
        return Math.max(x,y);
	}	
    
    public static long maxSumofNonAdjascentele(ArrayList<Integer> list){
        int n=list.size();
        long prev=list.get(0);
        long prev2=0;
        for(int index=1;index<n;index++){
            long pick=list.get(index);
            if(index>1)
                pick+=prev2;
            long notPick=0+prev;
            long curri= Math.max(pick,notPick);
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
}