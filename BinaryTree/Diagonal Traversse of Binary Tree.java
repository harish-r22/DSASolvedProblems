//Diagonal Traversse of Binary Tree

public class Solution{
   static class Node{
     int data;
     Node left;
     Node right;
     int vl;
     Node(int vl,int data){
      this.vl=vl;
      this.data=data;
      left=right=null; 
     }
    }
   public List<List<Integer>> diagonalTraverse(Node root){
     Queue<Node> queue= new LinkedList<>();
     Map<Integer,List<Integer>> map= new TreeMap<>();
     root.vl=0;
     queue.add(root); 
     while(!queue.isEmpty()){
      Node temp=queue.poll();
      int vl=temp.vl;
      map.putIfAbscent(vl, new ArrayList<>());
      map.get(vl).add(temp.data); 
       if(temp.left!=null){
        queue.add(new Node(vl+1,temp.left);
        }
        if(temp.right!=null){
        queue.add(new Node(vl,temp.right);
        }
      }
      List<List<Integer>> result= new ArrayList<>();
     for(Map.EntrySet<Ineteger,List<Integer>> entry : map.entrySet()){
        result.add(new ArrayList<>());
        for(int x: entry.getValues()){
         result.get(result.size()-1).add(x);
         }
      }
     return result;
   }
}

time complexcity : o(n)
space complexcity : o(n)