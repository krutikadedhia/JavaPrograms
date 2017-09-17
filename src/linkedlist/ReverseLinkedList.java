package linkedlist;

public class ReverseLinkedList {

	Node head;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ReverseLinkedList li = new ReverseLinkedList();
	li.insert(10);
	li.insert(20);
	li.insert(30);
	li.insert(40);

	System.out.println("Given LinkedList");
	li.print(li.head);
	
	Node head1 = li.reverse(li.head);
	System.out.println("Reversed LinkedList");
	li.print(head1);
	}
	public void insert(int data){
		Node n = new Node(data);
		n.link = head;
		head = n;
	}
	
	public void print(Node node){
		Node temp = node;
		while(temp != null){
			System.out.println(temp.toString());	
			temp = temp.link;
			}
	}
	
	public Node reverse(Node node){
		Node current = head;
		Node prev = null;
		Node next = null;
		while (current != null){
			next = current.link;
			current.link = prev;
			prev = current;
			current = next;
		}
		node = prev;
		return node;
	}
}
