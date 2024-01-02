package dataStructure;

import java.util.Scanner;

public class InsertNode {
	
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode;
			} else {
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
	
	public static void printLL(Node<Integer> head) {
		Node<Integer> temp = head;		
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}		
	}
	
	public static void insertNode(Node<Integer>head, int elem, int pos) {
		Node<Integer> nodeToBeInserted = new Node<>(elem);
		int count = 0;
		Node<Integer> prev = head;
		while(count < pos-1 ) {
			count++;
			prev = prev.next;
		}
		nodeToBeInserted.next = prev.next;
		prev.next = nodeToBeInserted; 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput();
		printLL(head);

	}

}
