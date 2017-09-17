package linkedlist;

import java.util.Scanner;

public class LinkedListTest {
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of values");
		int number = scan.nextInt();
		Node head = null;
		
		//insert the values
		while(number > 0)
		{
			int data = scan.nextInt();
			head = insert(head,data);
			number--;
		}
		
		//display the values in the list
		System.out.println("The values in the list:");
		display(head);
		
		//search an element
		System.out.println("Enter element to be searched");
		int search_data = scan.nextInt();
		boolean result = search(head,search_data);
		if(result == true)
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	
		//delete an element
		System.out.println("Enter element to be deleted");
		int delete_data = scan.nextInt();
		delete(head, delete_data);
		
		System.out.println("Values after deletion");
		display(head);
		scan.close();
	}
	public static Node insert(Node head, int data){
		if(head == null)
		{
			Node node = new Node(data);
			return node;
		}
		else{	
			Node temp = head;
			while(temp.link != null){
				temp = temp.link;
			}
			Node node = new Node(data);
			temp.link = node;
			return head;
		}
	}
	
	public static void display(Node head){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.toString());
			temp = temp.link;
		}
	}
	
	public static boolean search(Node head, int data){
		Node temp = head;
		while(temp != null){
			if(temp.data == data )
				return true;
			temp = temp.link;
		}
		return false;
	}
	
	public static void delete(Node head, int data){
		Node temp = head;
		Node previous = head;
		while(temp !=null){
			if(temp.data == data){
				previous.link = temp.link;
			}
			previous = temp;
			temp = temp.link;
		}
	}
}
