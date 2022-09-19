//Segregate Odd Even Linked List

public class Solution{
	public Node oddEvenList(Node head){
		if(head==null || head.next==null  ){
			return head;
		}
		Node end =head;
		int counter=0;
		while(end!=null){
			end=end.next;
			counter++;
		}
		
		counter = counter&1?(counter/2)+1:counter/2;
		Node temp=head;
		while(counter--){
			end.next=temp.next;
			temp.next=temp.next.next;
			end.next.next=null;
			temp=temp.next;
			end=end.next;
			
		}
		return head;
	}
	
}
time complexcity : o(n+n)
space complexcity: o(1)




------------------------------------

public class Solution{
	public Node oddEvenList(Node head){
		if(head==null || head.next==null  ){
			return head;
		}
		Node odd=head;
		Node even =head.next;
		
		Node oddHead=head;
		Node evenHead =head.next;
		
		while(even!=null && even.next!=null){
			odd.next=odd.next.next;
			even.next=even.next.next;
			odd=odd.next;
			even=even.next;
		}
		odd.next=evenHead
		return head;
	}
}

time complexcity : o(n)
space complexcity: o(1)