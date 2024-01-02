package tressDS;

public class printTree {
	
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
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
		
		BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
		
		root.left = rootLeft;
		root.right = rootRight;
		
		printTreeDeatailed(root);

	}

}
