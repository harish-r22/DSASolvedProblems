//Find All Duplicate Subtrees

  public class Duplicate_subtress{
         static HashMap<String, Integer> map;
         static class Node {
         int data;
         Node left;
         Node right;
         Node(int data){
            this.data = data;
            left = null;
            right = null;
         }
      }  
      
     static String inOrder(Node node){
       if(node ==null)
          return "";
         
        String str="(";
        str + =inOrder(node.left);
        str+ = Integer.valueOf(node.data);
        str+ = inOrder(node.right);
        str+ =")"; 
         
        if(map.get(str)!=null && map.get(str)==1){
            System.out.println(node.data + "");
         }    
          if(map.containskey(str)){
            map.put(str,map.get(str)+1);
           }
         else
          map.put(str,1);

       return str;
      }
      
     // Wrapper over inorder()
    static void printAllDups(Node root)
    {
        m = new HashMap<>();
        inorder(root);
    }
    // Driver code
    public static void main(String args[])
    {
        Node root = null;
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        printAllDups(root);
    }

 } 

Time Complexity: O(N^2)  Since string copying takes O(n) extra time.
Auxiliary Space: O(N^2) Since we are hashing a string for each node and length of this string can be of the order N. 