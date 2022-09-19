//Populate Inorder Successor for all nodes

class Node {
    int data;
    Node left, right, next;
 
    Node(int item)
    {
        data = item;
        left = right = next = null;
    }
   }

public class Solution{
	Node root;
    static Node next = null;
	public void populateNext(Node node){
		if(node!=null){
			populateNext(node.right);
			node.next=next;
			next=node;
			populateNext(node.left);
		}
	}
}


time complexcity : o(n)
space complexcity :o(n)