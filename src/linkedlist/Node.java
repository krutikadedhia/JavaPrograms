package linkedlist;

public class Node {
	
	int data;
	Node link;
	
	public Node(int data){
		this.data = data;
		link = null;
	}
	
	public String toString(){
		return data + " ";
	}

}
