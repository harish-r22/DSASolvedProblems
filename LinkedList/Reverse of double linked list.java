//Reverse of double linked list

public class Solution{
	public Node reverseDoubleLinkedList(Node head){
		Node temp=head;
		Node curr=head;
		Node prev=null;
		while(curr!=null){
			curr=curr.next;
			temp.next=prev;
			temp.prev=curr;
			prev=temp;
			temp=curr;
			
		}
		return prev;
	}
}