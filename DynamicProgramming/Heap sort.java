//Heap sort

public class Solution{
	
	public void sort(int [] arr, int n){
		int startIndex=n/2-1;
		for(int i=startIndex;i>=0;i-- ){
			heapify(arr,n,i);
		}
		
		for(int n-1;i>=0;i--){
			int temp=arr[0];
			arr[i]=arr[i];
			arr[i]=temp;
			heapify(arr,i,0);
		}
	}
	
	public void heapify(int [] arr, int n, int i){
		int largest=i;
		int left=2*i+1;
		int right=2*i+2;
		if(left<n && arr[largest] < arr[left]) {
			largest=left;
		}
		if(right<n && arr[largest] < arr[right]){
			largest=right;
		}
        if(i!=largest){
			int temp=arr[i];
			arr[largest]=arr[i];
			arr[i]=temp;
			heapify(arr,n,largest);
		}			
	}
	
	 static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
	
	public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6, 7 };
        int n = arr.length;
 
        HeapSort ob = new HeapSort();
        ob.sort(arr);
 
        System.out.println("Sorted array is");
        printArray(arr);
    }
}

heap sort : time complexcity : o(nlogn)

Time complexity of heapify is O(Logn). 
Time complexity of createAndBuildHeap() is O(n) 
And, hence the overall time complexity of Heap Sort is O(nLogn)