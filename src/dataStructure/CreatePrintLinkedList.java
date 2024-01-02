package dataStructure;

public class CreatePrintLinkedList {
	
	public static Node<Integer> createLinkedList() {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<> (30);
		Node<Integer> n4 = new Node<>(40);
		Node<Integer> n5 = new Node<>(50);
		 n1.next= n2;
		 n2.next = n3;
		 n3.next = n4;
		 n4.next = n5;
		 return n1;
	}
	
	public static void printLinkedList(Node<Integer> head) {
		Node temp = head;
		System.out.println(temp);
		while(temp!=null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		temp = head;
		System.out.println(temp);
	}
	
	

	public static void main(String[] args) {
		
		Node<Integer> head = createLinkedList();
		printLinkedList(head);
		
		

	}

}
