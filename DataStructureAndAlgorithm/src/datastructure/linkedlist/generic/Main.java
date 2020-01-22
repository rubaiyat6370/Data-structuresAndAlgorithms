package datastructure.linkedlist.generic;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		LinkedList<Integer> list = new LinkedList();
		m.print(list.toString());
		
		list.inserAtFirst(10);
		list.inserAtFirst(2);
		list.inserAtFirst(4);
		list.inserAtFirst(34);
		list.inserAtFirst(78);
		list.inserAtFirst(15);
		list.inserAtFirst(24);
		list.insertAtLast(12);
		list.insertAtLast(13);
		list.insertAtLast(14);
		
		m.print(list.toString());
		
		m.print(list.delete(78));
		m.print(list.delete(14));
		m.print(list.toString());
		m.print(list.deleteTail());
		m.print(list.delete(111));
		m.print(list.toString());
		
		m.print(list.getMthElementFromTail(1));

	}
	
	public <T> void print(T s) {
		System.out.println(s);
	}

}
