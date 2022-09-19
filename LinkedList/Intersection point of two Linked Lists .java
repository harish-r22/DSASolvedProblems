//Intersection point of two Linked Lists 

public class Solution{
	public ListNode findIntersection(ListNode head1, ListNode head2){
		ListNode ptr1=head1;
		while(ptr1!=null){
			ListNode temp=ptr1;
			ListNode ptr2=head2;
			while(ptr2!=null){
				if(temp==ptr2){
					return temp;
				}
				ptr2=ptr2.next;
			}
			ptr1=ptr1.next;
		}
		return null;
	}
}

time complexcity : o(m*n)
space complexcity : o(1)

----------------------------------

public class Solution{
	public Node findIntersection(Node head1, Node head2){
		HashSet<Node> set= new HashSet<>();
		Node ptr1=head1;
		Node ptr2=head2;
		while(ptr1!=null){
			set.add(ptr1);
			ptr1=ptr1.next;
		}
		
		while(ptr2!=null){
		    if(set.contains(ptr2)){
				return ptr2.data;
			}
			ptr2=ptr2.next;
		}
		return 0;
	}
}


time complexcity : o(m+n)
space complexcity : o(n)

--------------------------------------


public class Solution{
	public Node findIntersection(Node head1, Node head2){
		Node dummy1=head1;
		Node dummy2=head2;
		while(dummy1!=dummy2){
			dummy1= ( dummy1== null) ? head2 : dummy1.next;
			dummy2=(dummy2 == null )? head1 : dummy2.next;
		}
		return dummy1.data;
	}
}


time complexcity : o(2m)
space complexcity : o(1)
