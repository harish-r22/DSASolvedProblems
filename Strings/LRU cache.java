//LRU cache

//LRU cache


class Node {
	int key,value;
	Node prev;
	Node next;
	Node(int key, int value){
		this.key=key;
		this.value=value;
	}
}

public class LruCache{
	Node head= new Node(0,0);
	Node tail = new Node(0,0);
	Map<Integer ,Node> map= new HashMap<>();
	int capacity;
	
	public LruCache(int capacity){
		capacity=capacity;
		head.next=tail;
		tail.prev=head;
	}
	
	public int get(int key){
		if(ma.containsKey(key)){
			Node node=map.get(key);
			remove(node);
			insert(node);
			return node.value;
		}else{
			return -1;
		}
	}
	
	pubic void put(int key, int value){
		if(map.containsKey(key)){
			map.remove(key);
		}
		if(map.size()==capacity){
			remove(tail.prev);
		}
		insert(new Node(key,value));
	}
	
	public void remove(Node node){
		map.remove(node.key);
		node.prev.next=node.next;
		node.next.prev=node.prev;
	}
	
	public void insert(Node node){
		map.put(node.key,node.value);
		node.next=head.next;
		node.next.prev=node;
		head.next=node;
		node.prev=head;
		
	}
}

Time Complexity:O(1)

Space Complexity:O(1)