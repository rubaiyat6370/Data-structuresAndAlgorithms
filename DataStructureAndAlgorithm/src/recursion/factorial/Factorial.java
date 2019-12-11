/**
 * 
 */
package recursion.factorial;

/**
 * @author Rubaiyat
 *
 */
public class Factorial {
	
	int factorial(int n) {
		if(n==1) {
			return 1;
		}
		return n* factorial(n-1);
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial();
		 
		System.out.println(f.factorial(11));;
	}

}
