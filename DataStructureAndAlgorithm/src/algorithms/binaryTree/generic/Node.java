package algorithms.binaryTree.generic;

public class Node<T> {
	private Node<T> left;
	private Node<T> right;
	private T value;
	
	public Node(T data) {
		this.value = data;
	}
	
	public T getData() {
		return this.value;
	}
	
	public void setData(T data) {
		this.value = data;
	}
	
	public Node<T> getLeft() {
		return this.left;
	}
	
	public Node<T> getRight(){
		return this.right;
	}
	
	public void setLeft(Node<T> node) {
		this.left = node;
	}

	public void setRight(Node<T> node) {
		this.right = node;
	}
}
