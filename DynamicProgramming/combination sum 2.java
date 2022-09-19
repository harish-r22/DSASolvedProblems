//combination sum

class Solution
{
    //Function to return a list of indexes denoting the required 
    //combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> arr, int sum)
    {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);
        generateCombinationSum(arr,sum,0, result, new ArrayList<Integer>());
        return result;
        
    }
    
    static void generateCombinationSum(ArrayList<Integer> arr,int sum,int index, 
    ArrayList<ArrayList<Integer>> result,ArrayList<Integer> temp){
        if(sum==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        
        for(int i=index;i<arr.size();i++){
            
            if((sum-arr.get(i))>=0){
                temp.add(arr.get(i));
                generateCombinationSum(arr,sum-arr.get(i),i,result,temp);
                temp.remove(arr.get(i));
            }
        }
    }
}