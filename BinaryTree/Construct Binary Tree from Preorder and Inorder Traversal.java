// Construct Binary Tree from Preorder and Inorder Traversal

public class Solution{

static class Node{
   int data;
   Node left,right;
   Node(int data){
   this.data=data;
   left=right=null;
  }
}

public Node BuildTree(int[] preorder,int[] inorder ){
     Map<Integer,Integer> map = new HashMap<>();
     for(int i=0;i<inorder.length;i++)
      map.put(inorder[i],i);
     return bulidTree(preoder,0,preoder.length-1,inorder,0,inorder.length-1,map)
    }

public Node buildTree(int[] preorder, int prestart,int preend ,int [] inorder, int instart, int inend,
        Map<Integer,Integer> map) {
    if(prestart>preend || instart>inend)
        return null;
    Node root=new Node(preorder[start]); 
    int inroot=map.get(root.data);
    int numsleft=inroot-instart;
    root.left=buildTree(preorder,prestart+1,prestart+numsleft,inorder, instart,inroot-1,map); 
    root.right=buildTree(preorder,prestart+numsleft+1,preend,inorder,inroot+1,inend,map)
    return root;
  }
}


time complexcity : o(N)
space complexity ; o(N)