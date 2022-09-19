//Bottom View of Binary Tree

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
    
     public List<Integer> generateBottomView(Node root){
      Queue<Node> queue= new LinkedList<>();
      Map<Integer,Integer> map= new TreeMap<>(); 
      root.vl=0;
      queue.add(root);
      while(!queue.isEmpty()){
        Node temp= queue.poll(); 
        int vl=temp.vl;
        map.put(vl,temp.data);
        if(temp.left!=null){
          temp.left.vl=vl-1;
          queue.add(temp.left);
        }
        if(temp.right!=null){
         temp.right.vl=vl+1;
          queue.add(temp.right);
        }  
     }
     List<Integer> result= new ArrayList<>();
      for(Map.Entry<Integer> entry : map.entrySet()){
        list.add(entry.getValue());
       } 
      return result; 
    }
   
}

time complexcity : o(n)

space complexcity : o(h)