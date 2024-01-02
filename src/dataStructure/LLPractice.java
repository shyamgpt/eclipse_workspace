package dataStructure;

import java.util.Scanner;

public class LLPractice {
	
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if(head == null) {
				head = currentNode; 
			}
			else {
				while(head.next != null) {
					head = head.next;
				}
				head.next = currentNode;
			}
			data = s.nextInt();
		}
		return head;
		
	}
	
	
	
	

	public static void main(String[] args) {
		

	}

}
