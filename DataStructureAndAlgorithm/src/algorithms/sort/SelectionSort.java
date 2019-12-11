package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
	
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

	public static void main(String[] args) {
		int []arr = {23, 45, 6, 12, 3, 9, 13};
		System.out.println(Arrays.toString(new SelectionSort().sort(arr)));

	}

}
