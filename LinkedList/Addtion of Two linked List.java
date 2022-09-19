//Addtion of Two linked List
public class Solution{
	public Node addLinkedList(Node l1, Node l2){
		int carry=0;
		Node dummy=new Node(0);
		Node temp=dummy;
		while(l1!=null || l2!=null ||  carry==1){
			int sum=0;
			if(l1!=null){
				sum+=l1.data;
				l1=l1.next;
			}
			
			if(l2!=null){
				sum+=l2.data;
				l2=l2.next;
			}
			sum+=carry;
			Node node=new Node(sum%10);
			carry=sum/10;
			temp.next=node;
			temp=temp.next;
		}
		return dummy.next;
	}

}