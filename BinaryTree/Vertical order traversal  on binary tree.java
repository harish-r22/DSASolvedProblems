//Vertical order traversal  on binary tree

public class Solution{
     static class Tuple{
      int row;
      int col;
      Node node;
      Tuple(int x,int y,Node node){
       this.row=x;
       this.col=y;
       this.node=node; 
       }  
    }

     public List<List<Integer>> generateVericalOrder(Node root){
       Queue<Tuple> queue = new LinkedList<>();
       TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map= new TreeMap<>();
       queue.add(new Tuple(0,0,root));
       while(!queue.isEmpty()){
        Tuple tuple=queue.poll();
        int x= tuple.row;
        int y=tuple.col;
        Node node= tuple.node;
        if(!map.containsKey(x)){
          map.put(x, new TreeMap<>());
        } 
        if(!map.containsKey(x).get(y)){
           map.get(x).put(y, new PriorityQueue<>());
        }
        map.get(x).get(y).offer(node.val);
       
        if(node.left!=null){  
        queue.offer(new Tuple(x-1,y+1,node.left));
        }  
         if(node.right!=null){  
        queue.offer(new Tuple(x+1,y+1,node.right));
        }  
         
     } 
        List<List<Integer>> list= new ArrayList<>();
        for(Map<Integer,PriorityQueue<Integer>> map : map.values()){
         list.add(new ArrayList<>());
         for(PriorityQueue<Integer> que : map.getValues()){
           while(!que.isEmpty()){
            list.get(list.size()-1).add(que.poll()); 
           }
          } 
        }
       return list;
     }
}