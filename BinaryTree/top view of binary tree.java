//top view of binary tree

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static class Pair{
       int ln=0;
       Node node;
       Pair(int ln,Node node){
           this.ln=ln;
           this.node=node;
       }
    }
    static ArrayList<Integer> topView(Node root)
    {
       ArrayList<Integer> result= new ArrayList<>();
       Map<Integer,Integer> map= new TreeMap<>();
       Queue<Pair> queue= new LinkedList<>();
       queue.add(new Pair(0,root));
       while(!queue.isEmpty()){
           
         Pair temp=queue.poll();
         int hd=temp.ln;
         Node node=temp.node;
         if(map.get(hd)==null){
             map.put(hd,node.data);
         }
         if(node.left!=null){
             queue.add(new Pair(hd-1,node.left));
         }
         if(node.right!=null){
             queue.add(new Pair(hd+1,node.right));
         }
         
       }
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           result.add(entry.getValue());
       } 
       
        return result;   
    }
}