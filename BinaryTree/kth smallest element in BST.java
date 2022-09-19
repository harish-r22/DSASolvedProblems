//kth smallest element in BST


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
   
   public static Node getKthLargestEle(Node root,int k){
		int count =0;
		Node largest=null;
		Node curr=root;
		while(curr!=null){
			if(curr.left==null){
				if(++count==k){
					largest=curr;
				}
				curr=curr.right;
			}else{
				Node prev=curr.left;
				while(prev.right!=null && prev.right!=curr){
					prev=prev.right;
				}
				if(prev.right==null){
					prev.right=curr;
					curr=curr.left;
				}else{
					prev.right=null;
					if(++count==k){
					largest=curr;
				    }
					curr=curr.right;
				}
			}
		}
		
		return largest;
	}
    
	public static void main (String[] args) {
	  Node root = newNode(5);
    root.left = newNode(3);
    root.left.right=newNode(4);
    root.left.left=newNode(2);
    root.left.left.left=newNode(1);
    root.right = newNode(6);
    
   
 
    System.out.println("Finding K-th largest Node in BST : " +
                    getKthLargestEle(root, 3).data);
	}
}


time complexcity : o(n)
space complexcity : o(1)