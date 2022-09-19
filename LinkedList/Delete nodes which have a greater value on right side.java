//Delete nodes which have a greater value on right side

public class Solution{
	public Node deleteGreaterNode(Node head){
		Node curr= head;
		while(curr!=null && curr.next!=null){
			Node temp=curr.next;
			while(temp!=null){
				if(temp.data >curr.data){
					
					curr.next=temp.next.next;
				}
				temp=temp.next;
			}
			curr=curr.next;
		}
		return head;
	}
}







time complexcity : o(n2)
space complexcity : o(1)


-----------------------------------------------
12->15->10->11->5->6->2->3->NULL

null<-3<-2<-6<-5<-11<-10<-15<-12



public class Solution{
	public Node deleteGreaterNode(Node head){
		head=reverse(head);
		head=deleteGreaterNodeRev(head);
		head=reverse(head);
		return head;
	}
	
	public Node deleteGreaterNodeRev(Node head){
		Node maxNode=head;
		Node cur=head;
		Node temp;
		while(cur!=null && cur.next!=null){
			if(cur.next.data < maxNode.data ){
				temp=cur.next;
				cur.next=temp.next;
				temp=null;
			}else{
				cur=cur.next;
				maxNode=cur;
			}
		}
		return head;
	}
	
	public Node reverse(Node head){
		Node curr=head;
		Node prev=null;
		Node temp=head;
		while(curr!=null){
			temp=curr.next;
			curr.next=prev;
			prev=curr;
			curr=temp;
		}
		return prev;
	}
}

time complexcity : o(n)
space complexcity ; o(1)

