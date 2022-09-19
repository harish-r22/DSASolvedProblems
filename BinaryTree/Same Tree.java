//Same Tree

public class Solution{

public boolean sameTree(Node root1,Node root2){
    if(root1==null && root2==null)
      return true;
    
    if(root1==null || root2==null)
      return false;

    if(root1.data !=root2.data)
     return false;

    return (sameTree(root1.left,root2.left)&&   sameTree(root1.right,root2.right));
}

}