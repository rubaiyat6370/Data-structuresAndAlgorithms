package datastructure.linkedlist.generic;

public class Node<T> {
	
	private T value;
	private Node<T> next = null;
	private Node<T> prev = null;
	
	public Node(T data) {
		this.value = data;
	}
	
	public void setValue(T data) {
		this.value = data;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setPrevious(Node<T> prev) {
		this.prev = prev;
	}
	
	public Node<T> getPrevious() {
		return this.prev;
	}
	
	public Node<T> getNext(){
		return this.next;
	}
	
	public T getValue() {
		return this.value;
	}

	@Override
	public String toString() {
		return "[value=" + value + "]";
	}

}
