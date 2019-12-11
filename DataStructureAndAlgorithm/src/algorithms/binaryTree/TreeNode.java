package algorithms.binaryTree;

public class TreeNode {
	private int data;
	private TreeNode left = null;
	private TreeNode right = null;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void setLeftNode(TreeNode node) {
		this.left = node;
	}
	
	public void setRightNode(TreeNode node) {
		this.right = node;
	}
	
	public TreeNode getLeftNode() {
		return this.left;
	}
	
	public TreeNode getRightNode() {
		return this.right;
	}
	
	public int getData() {
		return this.data;
	}

	@Override
	public String toString() {
		return "TreeNode [data=" + data + "]";
	}
	
	
}
