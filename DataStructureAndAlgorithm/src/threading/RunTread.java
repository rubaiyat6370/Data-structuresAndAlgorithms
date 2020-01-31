/**
 * 
 */
package threading;

/**
 * @author Rubaiyat
 *
 */
public class RunTread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IntBuffer buffer = new IntBuffer();
		Consumer c = new Consumer(buffer);
		Producer p = new Producer(buffer);
		
		p.start();
		c.start();

	}

}
