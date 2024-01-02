package tressDS;

import java.util.Scanner;

public class InputBinaryTree {
	
	public static BinaryTreeNode<Integer> takeTreeInput(){
		System.out.println("enter root data");
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput();
		BinaryTreeNode<Integer> rightChild = takeTreeInput();
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	//27265,11,594
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
