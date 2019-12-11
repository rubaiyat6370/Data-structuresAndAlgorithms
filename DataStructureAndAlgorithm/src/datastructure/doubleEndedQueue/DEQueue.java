/**
 * 
 */
package datastructure.doubleEndedQueue;

/**
 * @author Rubaiyat
 *
 */
public class DEQueue {
	int maxSize = 10;
	private int[] queue = new int [maxSize];
	private int head = -1;
	private int tail = -1;
	private int size = 0;
	
	public void insertLeft(int data) {
		size++;
		if(head<=0) {
			head = maxSize;
		}
		queue[--head] = data;
	}
	
	public void insertRight(int data) {
		size++;
		
		if(tail>=maxSize-1) {
			tail = -1;
		}
		queue[++tail] = data;
	}
	
	public int deQueueLeft() {
		size--;
		if(head>=maxSize-1) {
			head = -1;
		}
		return queue[++head];
	}
	
	public int deQueueRight() {
		size--;
		if(tail<=0) {
			tail = maxSize;
		}
		return queue[--tail];
	}
	
	public static void main(String[] args) {
		DEQueue dq = new DEQueue();
		
		dq.insertLeft(1);
		dq.insertRight(2);
		dq.insertLeft(3);
		dq.insertRight(4);
		dq.insertLeft(5);
		dq.insertRight(6);
		dq.insertRight(7);
		dq.insertRight(8);
		dq.insertRight(9);
		dq.deQueueRight();
		dq.deQueueRight();
		dq.deQueueRight();
		dq.insertLeft(10);
		dq.insertLeft(11);
		dq.insertLeft(12);
		
	}
}
