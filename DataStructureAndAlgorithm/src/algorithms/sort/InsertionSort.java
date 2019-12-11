/**
 * 
 */
package algorithms.sort;

import java.util.Arrays;

/**
 * @author Rubaiyat
 *
 */
public class InsertionSort {
	
	public int[] sort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int currentPos  = i;
			for(int j=i+1;j>=0 && j< arr.length && currentPos>=0;j--) {
				if(arr[j]<arr[currentPos]) {
					int temp = arr[currentPos];
					arr[currentPos] = arr[j];
					arr[j] = temp;
					currentPos--;
				} else {
					break;
				}
			}
		}
		
		return arr;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int []arr = {23, 45, 6, 12, 3, 9, 13};
		System.out.println(Arrays.toString(new InsertionSort().sort(arr)));
	}

}
