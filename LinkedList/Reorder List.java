//Reorder List


public class Solution{
	public Node reorderList(Node head){
		Node dummy= new Node(0);
        dummy.next=head;
		Node curr=head;
		int count=0;
		Stack<Node> stk= new Stack<>(); 
		while(curr!=null){
			stk.push(curr);
			curr=curr.next;
			count++;
		}
		Node curr1=head;
		while(count>1){
		  Node next = curr1.next;
		  curr1.next = stk.pop();
		  curr1=curr1.next;
		  curr1.next=next;
		  curr1=curr1.next;
		  count=count-2;
		}
		curr1.next=null;
		
		
		return dummy.next;
	}
}


time complexity : o(n+n)
space complexity : o(n)

------------------------------------------------

public class Solution{
	public Node reorderList(Node head){
	   // Your code here
        Node slow=head , fast=head; 
	   while(fast!=null && fast.next!=null){
		   slow=slow.next;
		   fast=fast.next.next;
	   }
	   Node curr=slow,temp,prev=null;
	   while(curr!=null){
		   temp=curr.next;
		   curr.next=prev;
		   prev=curr;
		   curr=temp;
	   }
	   
	   Node n1=head; 
	   Node n2=prev;
        while(n2.next!=null){
			temp=n1.next;
			n1.next=n2;
			n1=temp;
			
			temp=n2.next;
			n2.next=n1;
			n2=temp;
			
		}		
      return head;		
	}
}


time complexity : o(n+n)
space complexity o(1)

------------------