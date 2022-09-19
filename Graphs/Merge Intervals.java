//Merge Overlapping Intervals


{{6,8},{1,9},{2,4},{4,7}} ={1,9}
//{1,1}{2,4}{4,7}{6,8}={1,1}{2,8}

public class Solution{
	public int[][] mergeIntervals(int [][] nums){
		if(nums.length<=0){
			return nums;
		}
		List<int []> list = new ArrrayList<>();
		Arrays.sort(nums,(a,b)-> Integer.compare(a[0],b[0]));
		
		//Arrays.sort(arr,new Comparator<Interval>(){
          //  public int compare(Interval i1,Interval i2)
            //{
              //  return i1.start-i2.start;
            //}
        //});
		
		for(int [] interval : nums){
			if(list.size()==0){
				list.add(nums[i]);
			}else{
				int [] previousInterval= list.get(list.size()-1);
				if(previousInterval[1]>=interval[0]){
					previousInterval[1]=Math.max(previousInterval[1],interval[1]);
				}else{
					list.add(interval);
				}
			}
		}
		return list.toArray(new int[list.size()][] );
   
	}
}
time complexcity: o(nlogn)
space complexcity:o(n)




using satck
public void mergeIntervals(int [][] intervals){
	if(intervals.length<=0){
		return intervals;
	}
	Stack<int []> stack = new Stack<>();
	Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
	
	stack.push(intervals[0]);
    for(int i=0;i<intervals.length;i++){
		Interval top = stack.peek();
   
            // if current interval is not overlapping with stack top,
            // push it to the stack
            if (top.end < arr[i].start)
                stack.push(arr[i]);
   
            // Otherwise update the ending time of top if ending of current
            // interval is more
            else if (top.end < arr[i].end)
            {
                top.end = arr[i].end;
                stack.pop();
                stack.push(top);
            }
	}		
}

class Interval
{
    int start,end;
    Interval(int start, int end)
    {
        this.start=start;
        this.end=end;
    }
}

time complexcity: o(nlogn)
space complexcity:o(n)

----------------------





public class Solution{
	public void mergeIntervals(Interval [] arr){
		 Arrays.sort(arr,new Comparator<Interval>(){
            public int compare(Interval i1,Interval i2)
            {
                return i1.start - i2.start;
            }
        });
   
        int index = 0; // Stores index of last element
        // in output array (modified arr[])
   
        // Traverse all input Intervals
        for (int i=1; i<arr.length; i++)
        {
            // If this is not first Interval and overlaps
            // with the previous one
            if (arr[index].end >=  arr[i].start)
            {
                   // Merge previous and current Intervals
                arr[index].end = Math.max(arr[index].end, arr[i].end);
            }
            else {
                index++;
                arr[index] = arr[i];
            }   
        }
         
        // Now arr[0..index-1] stores the merged Intervals
        System.out.print("The Merged Intervals are: ");
        for (int i = 0; i <= index; i++)
        {
            System.out.print("[" + arr[i].start + ","
                                        + arr[i].end + "]");
        }
	}
	
	
	
}


time complexcity : o(nlogn)
space complexcity:o(1)