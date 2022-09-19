//Delete Nth node from the end of the given linked list

public class Solution{
	public ListNode removeNthFromEnd(ListNode head,  int n){
		ListNode dummy=new ListNode(0);
		dummy.next=head;
		ListNode slow=head;
		ListNode fast=head;
		
		for(int i=0;i<n;i++){
			fast=fast.next;
		}
		while(fast!=null){
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		 
		 return dummy.next;
	}
}

time complexcity : o(n+key)
space complexcity : o(1)
