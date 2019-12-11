/**
 * 
 */
package recursion.towerOfHenoi;

/**
 * @author Rubaiyat
 *
 */
public class TowerOfHenoi {

	/**
	 * @param args
	 */
	void move(int n, String from, String to, String inter) {
		if(n==0) return;
		move(n-1,from, inter, to);
		System.out.println("Move "+ n + " from " + from + " to " + to);
		move(n-1,inter,to,from);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TowerOfHenoi tf = new TowerOfHenoi();
		tf.move(3, "A", "C", "B");
	}

}
