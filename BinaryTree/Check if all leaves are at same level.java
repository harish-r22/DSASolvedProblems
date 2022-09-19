//Check if all leaves are at same level


class Node
{
    int data;
    Node left, right;
  
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
  
class Leaf
{
    int leaflevel=0;
}


public class Solution{
   Node root;
   Leaf mylevel=new Leaf();
   
 
   public boolean checkUtil(Node node,int level,Leaf leaflevel){
      if(node == null)
         return true;

      if(node.left == null && node.right == null){  
         if (leafLevel.leaflevel == 0)
            {
                // Set first found leaf's level
                leafLevel.leaflevel = level;
                return true;
            }
           return (level == leafLevel.leaflevel);
      }
        return checkUtil(node.left, level + 1, leafLevel)
                && checkUtil(node.right, level + 1, leafLevel);   
   }

 boolean check(Node node)
    {
        int level = 0;
        return checkUtil(node, level, mylevel);
    }
}

time complexcity : o(n)
space complexcity : o(n)