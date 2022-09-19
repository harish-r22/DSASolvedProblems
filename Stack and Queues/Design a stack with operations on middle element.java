//Design a stack with operations on middle element

//How to implement a stack which will support the following operations in O(1) time complexity? 
//1) push() which adds an element to the top of stack. 
//2) pop() which removes an element from top of stack. 
//3) findMiddle() which will return middle element of the stack. 
//4) deleteMiddle() which will delete the middle element. 


class DDLNode{
	int value;
	DDLNode prev;
	DDLNode next;
	public DDLNode(int value){
		this.value=value;
		
	}
}
public class Stack{
	DDLNode head;
	DDLNode prev;
	DDLNode next;
	DDLNode mid;
	int size;
	
	public void push(int element){
		DDLNode node= new DDLNode(element);
		if(size==0){
			head=node;
			mid=node;
			size++;
			return;
		}
		head.next=node;
		node.prev=head;
		head=head.next;
		if(size%2!=0){
			mid=mid.next;
		}
		size++;
	}
	
	public int pop(){
		int data=-1;
		 if (size == 0) {
            System.out.println("Stack is empty");
             return -1;
        }
		if(size!=0){
			if(size==1){
				data=head.value;
				head=null;
				mid=null;
			}else{
				data=head.value;
				head=head.prev;
				head.next=null;
				if(size%2!=0){
					mid=mid.prev;
				}
			}
			size--;
		}
		return data;
	}
	
	public int findMidle(){
		 if (size == 0) {
            System.out.println("Stack is empty");
             return -1;
        }
		return mid.data;
	}
	
	public void deleteMiddle(){
		 if (size == 0) {
            System.out.println("Stack is empty");
             return -1;
        }
		if(size!=0){
			if(size==1){
				head=null;
				mid=null;
			}else if(size==2){
				head=head.prev;
				mid=mid.prev;
				head.next=null;
			}else{
				mid.next.prev=mid.prev;
				mid.prev.next=mid.next;
				if(size%2!=0){
					mid=mid.prev;
				}
			}
			size--;
		}
		
	}
	
	 public static void main(String args[])
    {
        myStack ms = new myStack();
        ms.push(11);
        ms.push(22);
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.push(66);
        ms.push(77);
        ms.push(88);
        ms.push(99);
 
        System.out.println("Popped : " + ms.pop());
        System.out.println("Popped : " + ms.pop());
        System.out.println("Middle Element : "
                           + ms.findMiddle());
        ms.deleteMiddleElement();
        System.out.println("New Middle Element : "
                           + ms.findMiddle());
    }
	
}
