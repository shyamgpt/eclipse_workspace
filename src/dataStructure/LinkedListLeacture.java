package dataStructure;

//import org.w3c.dom.Node;

public class LinkedListLeacture {
	
	public static Node<Integer> createLinkList(){
		Node<Integer> n1 =new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<> (40);
		n1.next= n2;
		n2.next = n3;
		//n3.next = n4;
		return n1;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = createLinkList();
		System.out.println(head);
		
	}

	}
