//Merge two sorted linked list

public class Solution{
	public Node mergeSortedList(Node head1,Node head2){
		Node dummyNode= new Node(0);
		Node tail=dummyNode;
		while(true){
			
		if(head1==null){
			tail.next=head2;
			break;
		}
		if(head2==null){
			tail.next=head1;
			break;
		}
		if(head1.data <=head2.data){
			tail.next=head1;
			head1=head1.next;
		}else{
			tail.next=head2;
			head2=head2.next;
		}
		tail=tail.next;
	  }
	  return dummyNode.next;
	}
}


time complexcity: o(n1+n2)
space complexcity o(n)




public class Solution{
	public Node mergeSortedList(Node head1 , Node head2){
		if(head1==null){
			return head2;
		}
		if(head2==null){
			return head1;
		}
		if(head1.val > head2.val){
			Node temp=l1;
			l1=l2;
			l2=temp;
		}
		Node res=l1;
		while(head1!=null && head2!=null){
			Node tmp=null;
			while(l1!==null && l1.val<=l2.val){
				tmp=l1;
				l1=l1.next;
			}
			tmp.next=l2;
			
			Node node=2;
			l2=l1;
			l1=node;
		}
		return res;
	}
}

time complexcity: o(n1+n2)
space complexcity o(1)