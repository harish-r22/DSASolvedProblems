//minimum number swpas required convert BT to BST


//Given the array representation of Complete Binary Tree i.e, if index i is the parent, 
//index 2*i + 1 is the left child and index 2*i + 2 is the right child. 
//The task is to find the minimum number of swap required to convert it into Binary Search Tree.


public class Solution{
     
     public static class Pair{
        int first;
        int secound;
        Pair(int x, int y){
        this.first=x;
        this.secound=y; 
        }
     }  

   
     public static int minimumSwaps(Vector<Integer> vec){
        ArrayList<Pair> list= new ArrayList<>();
        for(int i=0;i<vec.size();i++) { 
          list.add(new Pair(vec.get(i),i));
         }
        list.sort(new Comparator<Pair>(){
         @Override
         public int compare(Pair o1,Pair o2){
            return o1.first-o2.first;
         }
        });
          
         int swaps=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).secound==i)
            continue;
            else{ 
             swaps++;
             Collections.swap(list, i, list.get(i).secound);
             --i;
            }  
             
         }    
       return swaps;
     }


     
     public static void inorder(int [] arr, Vector<Integer> temp, int n , int i){
      if(i>=n)
        return;
      inorder(arr,temp,n,2*i+1);
        temp.add(arr[i]);
      inorder(arr,temp,n,2*i+1);  
     }  

    public static void main(String [] args){
     int [] arr= {5, 6, 7, 8, 9, 10, 11 };
     int n=arr.length;
     Vector<Integer> vect= new Vector<>();
      inorder(arr,vect,n,0);  
      System.out.println(minimumSwaps(vect));
    } 
}