/**
 * 
 */
package datastructure.queue;

/**
 * @author Rubaiyat
 *
 */
public class Queue {
	
	int maxSize = 10;
	
	private int[] queue = new int [maxSize];
	private int head = 0;
	private int tail = -1;
	private int size = 0;
	
	public void enQueue(int data) {
		if(tail>=maxSize-1) {
			tail = -1;
		}
		queue[++tail] = data;
		size++;
	}
	
	public int deQueue() {
		
		if(head>=maxSize) {
			head = 0;
		}
		size--;
		return queue[head++];
	}
	
	public int peek() {
		return queue[head];
	}
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enQueue(1);
		q.enQueue(2);
		q.enQueue(3);
		q.deQueue();
		q.enQueue(4);
		q.deQueue();
		q.enQueue(5);
		q.enQueue(6);
		q.enQueue(7);
		q.deQueue();
		q.enQueue(8);
		q.enQueue(9);
		q.enQueue(10);
		q.enQueue(11);
		q.deQueue();
		q.enQueue(12);
		q.deQueue();
		q.enQueue(13);
		q.enQueue(14);
		q.enQueue(15);
		q.deQueue();
		q.enQueue(16);
		
		System.out.println(q.peek());
		
		System.out.println(q.deQueue());
		
		System.out.println(q.peek());
		
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		System.out.println(q.getSize());
	}

}

class Run {
	
	
}
