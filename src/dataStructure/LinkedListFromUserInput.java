package dataStructure;

import java.util.Scanner;

public class LinkedListFromUserInput {
	
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
			}else {
				Node<Integer> tail = head;
				while(tail.next != null) {
					tail = tail.next;
				}
				tail.next = currentNode;
			}
			data = s.nextInt();
			
		}
		return head;  
		
	}
	
	public static void printLinkedList(Node<Integer> head) {
		Node<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}
	
	public static int length(Node<Integer> head) {
		  int count = 0;
		  while(head != null) {
			  count++;
			  head = head.next;
		  }
		  return count;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node<Integer> head = takeInput();
		printLinkedList(head);
		System.out.println("length of LinkedList is"+ " " + length(head));

	}

}
