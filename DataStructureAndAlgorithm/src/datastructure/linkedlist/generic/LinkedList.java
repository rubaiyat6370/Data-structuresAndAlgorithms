package datastructure.linkedlist.generic;

public class LinkedList<T> {
	private Node<T> head = null;
	private Node<T> tail = null;
	private int length = 0;
	
	public void inserAtFirst(T value) {
		Node<T> newNode = new Node<T>(value);
		if(head == null) {
			tail = newNode;
		} else {
			newNode.setNext(head);
			head.setPrevious(newNode);
		}
		head = newNode;
		length++;
	}
	
	public void insertAtLast(T value) {
		Node<T> newNode = new Node<T>(value);
		if(head == null) {
			head = newNode;
		} else {
			Node<T> current = head;
			
			while(current.getNext()!=null) {
				current = current.getNext();
			}
			newNode.setPrevious(current);
			current.setNext(newNode);
		}
		tail = newNode;
		length++;
	}
	
	public Node<T> search(T data) {
		Node<T> current = head;
		while(current!=null) {
			if(current.getValue() == data) {
				return current;
			}
			current = current.getNext();
		}
		return null;
	}
	
	public int Length() {
		return length;
	}
	
	public boolean delete(T value) {
		Node<T> itemToDelete = search(value);
		if(itemToDelete!=null) {
			if(itemToDelete.getPrevious()==null) {
				head = itemToDelete.getNext();
			} else if(itemToDelete.getNext()==null) {
				itemToDelete.getPrevious().setNext(null);
				tail = itemToDelete.getPrevious();
			} else {
				itemToDelete.getPrevious().setNext(itemToDelete.getNext());
				itemToDelete.getNext().setPrevious(itemToDelete.getPrevious());
			}
			length--;
			return true;
		}
		return false;
	}
	
	public boolean deleteHead() {
		if(head==null) return false;
		head = head.getNext();
		head.setPrevious(null);
		length--;
		return true;
	}
	
	public boolean deleteTail() {
		if(tail==null) return false;
		tail = tail.getPrevious();
		tail.setNext(null);
		length--;
		return true;
	}
	
	public Node<T> getMthElementFromTail(int position){
		Node<T> m = null,p;
		int count = 0;
		p = head;
		
		while(p!=null) {
			if(count==position) {
				m = head;
			}
			else if(m!=null) {
				m = m.getNext();
			}
			p = p.getNext();
			count++;
		}
		return m;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node<T> current = head;
		while(current!=null) {
			sb.append(current.toString());
			if(current.getNext()!=null) sb.append(",");
			current = current.getNext();
		}
		return "["+ sb.toString() + "]\nlength: " + length;
	}
}
