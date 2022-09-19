//construct-binary-tree-string-bracket-representation



/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    static class Node{
        int data;
        Node left,right;
    }
    static Node newNode(int data){
        Node node= new Node();
        node.data=data;
        node.left=node.right=null;
        return node;
    }
    static int findIndex(String str,int si,int sn){
          if (si > sn)
          return -1;
        Stack<Character> stack = new Stack<>();
        for(int i=si;i<=sn;i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }else if(str.charAt(i)==')'){
                if(stack.peek()=='(')
                  stack.pop();
                  
                if(stack.isEmpty())
                 return i;
            }
            
        }
        return -1;
    }
    static Node treeFromString(String str,int si, int ei){
        if(si>ei)
         return null;
         Node root= newNode(str.charAt(si)-'0');
         int index=-1;
         if(si+1 <=ei && str.charAt(si+1)=='('){
             index=findIndex(str,si+1,ei);
         }
         if(index!=-1){
             root.left=treeFromString(str,si+2,ei-1);
             root.right=treeFromString(str,index+2,ei-1);
         }
         return root;
    }
    static void preOrder(Node node){
    if (node == null)
      return;
    System.out.printf("%d ", node.data);
    preOrder(node.left);
    preOrder(node.right);
    }
    
	public static void main (String[] args) {
	String str = "4(2(3)(1))(6(5))";
    Node root = treeFromString(str, 0, str.length() - 1);
    preOrder(root);
	}
}