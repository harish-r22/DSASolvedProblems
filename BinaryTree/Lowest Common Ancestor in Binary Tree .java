//Lowest Common Ancestor in Binary Tree 

public class Solution{
     public Node lowestCommonAncestor(Node root, Node p, Node q){
       if(root == null || p==root || q==root)
          return root;
      Node left=lowestCommonAncestor(root.left,p,q);
      Node right =  lowestCommonAncestor(root.right,p,q);
      if(left==null){
           return right;
         }else if(right==null){
          return left;
         }else{
         return root;
       }   
     }
}

time complexcity : o(n)
space complexcity :o(1)