//detect a cycle in linkedlist

public class Solution{
	public boolean isCyclePresent(Node head){
		Node slow=head;
		Node fast=head.next;
		while(slow!=fast && fast!=null && fast.next!=null){
			slow=head.next;
			fast=fast.next.next;
		}
		if(slow==fast){
			return true;
		}
		return false;
	}
}