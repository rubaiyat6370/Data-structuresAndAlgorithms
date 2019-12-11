package algorithms.binaryTree;

public class BuildTree {

	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		bt.insertNode(20);
		bt.insertNode(2);
		bt.insertNode(10);
		bt.insertNode(5);
		bt.insertNode(9);
		bt.insertNode(15);
		
		System.out.println(bt.searchNode(10));
		System.out.println(bt.searchNode(0));
		System.out.println(bt.searchNode(5));
		System.out.println(bt.searchNode(15));
	}

}
