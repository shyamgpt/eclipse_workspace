package tressDS;

import java.util.Scanner;

public class inputTreeAndPrintImproved {
	
	public static BinaryTreeNode<Integer> takeTreeInput(boolean isRoot, int parentData, boolean isLeft){
		
	if(isRoot) {
		System.out.println("enter root data");
	}	else {
		if(isLeft) {
			System.out.println("enter left child of "+ parentData);
		}else {
			System.out.println("enter right child of " +parentData);
		}
	}
	Scanner s = new Scanner(System.in);
	int rootData = s.nextInt();
	
	if(rootData == -1) {
		return null;
	}
	
	BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
	BinaryTreeNode<Integer> leftChild = takeTreeInput(false, rootData, true);
	BinaryTreeNode<Integer> rightChild = takeTreeInput(false, rootData, false);
	root.left = leftChild;
	root.right = rightChild;
	return root;
	}
	
	
	public static void printTreeDetailed(BinaryTreeNode<Integer> root) {
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
		
		printTreeDetailed(root.left);
		printTreeDetailed(root.right);
	}
	
	
	public static int numNode(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftNodeCount = numNode(root.left);
		int rightNodeCount = numNode(root.right);
		
		return 1 + leftNodeCount + rightNodeCount;
	}
	
	public static int sumNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftSum = sumNode(root.left);
		int rightSum = sumNode(root.right);
		 return root.data+ leftSum+ rightSum;
	}
	
	public static int largest(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return -1;
		}
		
		int largestLeft = largest(root.left);
		int largestRight = largest(root.right);
		return Math.max(root.data, Math.max(largestLeft, largestRight));
		
	}
	
	
	public static int nodeGreaterThanX(BinaryTreeNode<Integer>root, int x) {
		if(root == null) {
			return -1;
		}
		
		
		
		int xOnLeft = nodeGreaterThanX(root.left, x);
		int xOnRight = nodeGreaterThanX(root.right, x);
		
		
		
		return Math.max(root.data, Math.max(x, Math.max(xOnLeft, xOnRight)));
				
				
				
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTreeNode<Integer> root = takeTreeInput(true, 0, true);
		printTreeDetailed(root);
		System.out.println( numNode(root));
		System.out.println("sum is " +sumNode(root));
		System.out.println("largest Node is " + largest(root));
		
		System.out.println("Enter the x to compare");
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		
		System.out.println("Max is " +nodeGreaterThanX(root, m));

	}

}
