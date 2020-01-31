/**
 * 
 */
package threading;

/**
 * @author Rubaiyat
 *
 */
public class IntBuffer {
	private int index;
	private int[] buffer = new int[10];
	
	public IntBuffer() {
		index = 0;
	}
	
	public synchronized void add(int data) {
		System.out.println("Produced: " + index);
		while(index == buffer.length) {
			try {
				System.out.println("Start Waiting Producer...");
				wait();
				System.out.println("End Waiting Producer...");
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		buffer[index++] = data;
		notifyAll();
	}
	
	public synchronized int remove() {
		System.out.println("Consumed: " + index);
		while(index == 0) {
			try {
				System.out.println("Start Waiting Consumer...");
				wait();
				System.out.println("End Waiting Consumer...");
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		
		int ret = buffer[--index];
		
		notifyAll();
		return ret;
	}

}
