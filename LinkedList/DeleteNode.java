//Given only a pointer/reference to a node to be deleted in a singly linked list, how do you delete it?

public class Solution{
	public void deleteNode(Node node){
		Node temp=node.next;
		node.data=temp.data;
		node.next=temp.next;
		temp=null;
	}
}