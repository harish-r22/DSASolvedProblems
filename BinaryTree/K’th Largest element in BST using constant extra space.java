//K’th Largest element in BST using constant extra space

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
			if(curr.right==null){
				if(++count==k){
					largest=curr;
				}
				curr=curr.left;
			}else{
				Node prev=curr.right;
				while(prev.left!=null && prev.left!=curr){
					prev=prev.left;
				}
				if(prev.left==null){
					prev.left=curr;
					curr=curr.right;
				}else{
					prev.left=null;
					if(++count==k){
					largest=curr;
				    }
					curr=curr.left;
				}
			}
		}
		
		return largest;
	}
    
	public static void main (String[] args) {
	  Node root = newNode(4);
    root.left = newNode(2);
    root.right = newNode(7);
    root.left.left = newNode(1);
    root.left.right = newNode(3);
    root.right.left = newNode(6);
    root.right.right = newNode(10);
 
    System.out.println("Finding K-th largest Node in BST : " +
                    getKthLargestEle(root, 2).data);
	}
}


time complexcity : o(n)
space complexcity : o(1)