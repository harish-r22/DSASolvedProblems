//Rearrange a Linked List in Zig-Zag fashion

A simple approach to do this is to sort the linked list using merge sort and then swap alternate, but that requires O(n Log n) 
time complexity. Here n is a number of elements in the linked list.  


----------------already done in reorder list---------

An efficient approach that requires O(n) time is, using a single scan similar to 
bubble sort and then maintain a flag for representing which order () currently we are. 
If the current two elements are not in that order then swap those elements otherwise not. 
Please refer to this for a detailed explanation of the swapping order. 


------------------------- efficient approach---------

public class Solution{
	
	public Node rearrangeLinkedList(Node head){
		Node curr=head;
		boolean flag=true;
		int temp=0;
		while(curr!=null && curr.next!=null){
			if(flag==true){
				if(curr.data > curr.next.data){
					temp=curr.data;
					curr.data=curr.next.data;
					curr.next.data=temp;
				}
			}else{
				if(curr.data< curr.next.data){
					temp=curr.data;
					curr.data=curr.next.data;
					curr.next.data=temp;
				}
			}
			curr=curr.next;
			flag=!flag;
		}
		return head;
	}
}