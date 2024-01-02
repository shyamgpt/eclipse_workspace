package tressDS;

import java.util.Scanner;

public class ImprovementOnTakingTreeInput {
	
	public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isLeft){
		
		if(isRoot) {
			System.out.println("Enter Root data");
		} else {
			if(isLeft) {
				System.out.println("enter Left child of" +parentData);
			} else {
				System.out.println("enter right child of" +parentData);
			}
		}
		Scanner s = new Scanner(System.in);
		int rootData = s.nextInt();
		
		if(rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild = takeTreeInput(false, rootData, true);
		BinaryTreeNode<Integer> rightChild = takeTreeInput(false, rootData, true);
		root.left = leftChild;
		root.right = rightChild;
		return root;
	}
	
	
	public static void printTreeDeatailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data + ":");
		if(root.left != null) {
			System.out.print("L" + root.left.data + ",");
		}
		if(root.right != null) {
			System.out.print("R" + root.right.data);
		}
		System.out.println();
		
		printTreeDeatailed(root.left);
		printTreeDeatailed(root.right);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeTreeInput(true, 0, true);
		printTreeDeatailed(root);

	}

}
