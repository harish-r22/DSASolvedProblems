//find the diameter of given Tree


public class Solution{
  int maxValue=Integer.MIN_VALUE;
  public int findDiameter(Node root){
     findMax(root);
   return maxValue;
  }

public int rightHeight(Node root){
if(root==null)
  return 0;
 return 1+rightHeight(node.right);
}

public int leftHeight(Node root){
if(root==null)
  return 0;
 return 1+leftHeight(node.left);
}

public void findMax(Node root){
  if(root==null)
     return;

   int rh=rightHeihgt(root.right);
   int lh=leftHeight(root.left);

   maxvalue=Math.max(maxvalue,rh+lh);
   findMax(root.left);
   findMax(root.right);
 }

}



time complexcity : o(n2)
space complexcity : o(h+h)


--------------------------------------

public class Solution{
  int maxValue=Integer.MIN_VALUE;
 public int diameter(Node root){
    return findMax(root,maxValue);
  }

   public int findMax(Node root,int maxValue){
     if(node==null)
     return 0;

    int lh=findMax(node.left,maxValue);
    int rh=findMax(node.right,maxValue);
    maxValue=Math.max(maxValue,lh+rh);
    return 1+Math.max(lh,rh);

   }


}

time complexcity : o(n)
space complexcity : o(h)