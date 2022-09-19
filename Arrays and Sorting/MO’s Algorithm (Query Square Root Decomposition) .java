//MO’s Algorithm (Query Square Root Decomposition) 

//We are given an array and a set of query ranges, we are required to find the sum of every query range.

Input:  arr[]   = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        query[] = [0, 4], [1, 3] [2, 4]
Output: Sum of arr[] elements in range [0, 4] is 8
        Sum of arr[] elements in range [1, 3] is 4  
        Sum of arr[] elements in range [2, 4] is 6
		

class Query{
    int L;
    int R;
    Query(int L, int R){
        this.L = L;
        this.R = R;
    }
}		

public class Solution{
	public void printQuerySums(int nums[], int n,ArrayList<Query> q, int m){
		for(int i=0;i<m;i++){
			int sum=0;
			int l=q.get(i).L; int r=q.get(i).R;
			for(int i=l;i<=r;i++){
				sum+=nums[i];
			}
				System.out.println("Sum of [" + L +
                           ", " + R + "] is "  + sum);			
		}
	}
	
	public static void main(String argv[])
    {
        int a[] = {1, 1, 2, 1, 3, 4, 5, 2, 8};
        int n = a.length;
         
        ArrayList<Query> q = new ArrayList<Query>();
        q.add(new Query(0,4));
        q.add(new Query(1,3));
        q.add(new Query(2,4));
         
        int m = q.size();
        printQuerySums(a, n, q, m);
    }
	
}