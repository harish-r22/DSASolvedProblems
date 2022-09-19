//Linked List

public class LinkedList{
	Node head;
	public class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
	
	public void insertAtBegining(int data){
		Node node = new Node(data);
		node.next=head;
		head=node;
	}
	
	public void insertAfter(Node prev, int data){
		if(prev==null){
			System.out.println("the given previous node cannot be null");
			return;
		}
		Node newNode= new Node(data);
		newNode.next=prev.next;
		prev.next=newNode;
	}
	public void insertAtEnd(int data){
		if(head==null){
			head= new Node(data);
			return;
		}
		Node newNode= new Node(data);
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		last.next=newNode;
		return;
	}
	
	public void deleteNode(int postion){
		if(head==null){
			return;
		}
		Node temp=head;
		if(postion==0){
			head=temp.next;
			return;
		}
		for(int i=0 ; temp!=null && i<postion-1;i++){
			temp=temp.next;
		}
		if(temp==null || temp.next==null){
			return;
		}
		Node next=temp.next.next;
		temp.next=next;
	}
	public static void main(String [] args){
		LinkedList linkedlist= new LinkedList();
		linkedlist.head= new Node(1);
		Node secound= new Node(2);
		Node third= new Node(3);
		linkedlist.head.next=secound;
		secound.next=third;
		
		while(linkedlist.head!=null){
			System.out.println("value"+linkedlist.head.value);
			linkedlist.head=linkedlist.head.next;
		}
		
	}
}