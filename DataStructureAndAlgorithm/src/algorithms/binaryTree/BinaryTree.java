package algorithms.binaryTree;

public class BinaryTree {
	TreeNode root = null;
	
	public void insertNode(int data) {
		if(root == null) {
			root = new TreeNode(data);
		} else {
			TreeNode current  = root;
			
			while(current!=null) {
				if(data >= current.getData()) {
					if(current.getRightNode()!= null) {
						current = current.getRightNode();
					} else {
						current.setRightNode(new TreeNode(data));
						break;
					}
					
				} else {
					if(current.getLeftNode()!=null) {
						current = current.getLeftNode();
					} else {
						current.setLeftNode(new TreeNode(data));
						break;
					}
					
				}
			}
		
		}
	}
	
	public boolean searchNode(int data) {
		TreeNode current  = root;
		
		while(current!=null) {
			if(data > current.getData()) {
				current = current.getRightNode();
			} else if(data < current.getData()) {
				current = current.getLeftNode();
			} else if(data == current.getData()) {
				return true;
			}
		}
		return false;
	}
}
