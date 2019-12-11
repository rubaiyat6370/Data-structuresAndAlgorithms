package datastructure.linkedlist;

public class LinkedList {
	
	private Node head;
	
	int length = 0;
	
	public void insertAtLast(int value) {
		length++;
		Node cur = head;
		Node newNode = new Node(value, null);
		if(cur==null) {
			head = newNode;
		} else {
			while(cur.getNext()!=null) {
				cur = cur.getNext();
			}
			cur.setNext(newNode);
		}
	}
	
	public void insertSorted(int value) {
		Node newNode = new Node(value, null);
		
		if(head==null || value < head.getValue()) {
			newNode.setNext(head);
			head = newNode;
		} else {
			Node cur = head;
			
			while(cur.getNext()!=null) {
				if(value>=cur.getValue() && value<cur.getNext().getValue()) {
					newNode.setNext(cur.getNext());
					cur.setNext(newNode);
					return;
				}
				cur = cur.getNext();
			}
			cur.setNext(newNode);
		}
	}
	
	public void insertAtFirst(int value) {
		length++;
		Node newNode = new Node(value, head);
		head = newNode;
	}
	
	public boolean search(int value) {
		Node cur = head;
		
		if(cur==null) {
			return false;
		} else {
			while(cur!=null) {
				if(cur.getValue()==value) {
					return true;
				}
				cur = cur.getNext();
			}
		}
		
		return false;
	}
	
	public int getHead() {
		if (head!=null) {
			return head.getValue();
		}
		else return -1;
	}
	
	public void deleteHead() {
		head = head.getNext();
		length--;
	}
	
	public void printList() {
		Node cur = head;
		
		System.out.print("[");
		
		while(cur.getNext()!=null) {
			System.out.print(cur.getValue() + ",");
			cur = cur.getNext();
		}
		
		System.out.print(cur.getValue() + "]");
	}

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
//		list.insertAtFirst(10);
//		list.insertAtFirst(2);
//		list.insertAtFirst(4);
//		list.insertAtFirst(34);
//		list.insertAtFirst(78);
//		list.insertAtFirst(15);
//		list.insertAtFirst(24);
//		
		
		
//		System.out.println("\nLength: " + list.length);
//		
//		list.deleteHead();
//		
//		list.printList();
//		
//		System.out.println("\nLength: " + list.length);
//		
//		System.out.println(list.search(78));
		
		
		list.insertSorted(10);
		list.insertSorted(2);
		list.insertSorted(4);
		list.insertSorted(34);
		list.insertSorted(78);
		list.insertSorted(15);
		list.insertSorted(24);
		
		list.printList();

	}

}
