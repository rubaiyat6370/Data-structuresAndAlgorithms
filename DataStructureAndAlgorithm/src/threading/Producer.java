/**
 * 
 */
package threading;

import java.util.Random;

/**
 * @author Rubaiyat
 *
 */
public class Producer extends Thread{
	private IntBuffer buffer;
	
	public Producer(IntBuffer buffer) {
		this.buffer = buffer;
	}
	
	@Override
	public void run() {
		Random r = new Random();
		while(true) {
			int num = r.nextInt(10);
			buffer.add(num);
			//System.out.println("Produced: " + num);
		}
	}
}
