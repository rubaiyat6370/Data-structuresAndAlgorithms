package algorithms.sort;

import java.util.Arrays;

// Selection sort is independent of data
//because it always keeps comparing all data
// can't identify if a list is already sorted
// it is an in place sorting algorithm 
// because it does not need any extra memory to perform sorting
// time complexity is O(n2)

//“One advantage that the original unstable selection sort 
//had over many other sort algorithms is that the total 
//number of moves (swaps) is O( n)”

public class SelectionSort {
	
	// Unstable selection sort
	public int[] sort(int []arr) {
		int minPos = 0;
		for(int p = 0; p <arr.length; p++) {
			minPos = p;
			for(int i=p+1;i<arr.length;i++) {
				if(arr[i]<arr[minPos]) {
					minPos = i;
				}
			}
			int temp = arr[p];
			arr[p] = arr[minPos];
			arr[minPos] = temp;
		}
		return arr;
	}
	
	// Sort an array using a stable selection sort. 
	public void selectionSortStable( int[] data ){
		for( int start = 0; start < data.length - 1; ++start ){ 
			insert( data, start, findMinimumIndex( data, start ) );
		} 
	}
	
	// Insert the data into the array, shifting the array as necessary. 
	private void insert( int[] data, int start, int minIndex ){
		if( minIndex > start ){
			int tmp = data[minIndex];
			System.arraycopy( data, start, data, start +1 , minIndex - start); data[start] = tmp;
		} 
	}
	
	private int findMinimumIndex(int[] data, int start) {
		int minPos = 0;
		for(int i=start;i<data.length;i++) {
			if(data[i]<data[minPos]) {
				minPos = i;
			}
		}
		return minPos;
	}
	
	/// Stable sort end here///
	

	public static void main(String[] args) {
		int []arr = {23, 45, 6, 12, 3, 9, 6, 13};
		System.out.println(Arrays.toString(new SelectionSort().sort(arr)));

	}

}
