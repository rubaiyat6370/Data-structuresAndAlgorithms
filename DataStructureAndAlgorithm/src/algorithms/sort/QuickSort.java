package algorithms.sort;

import java.util.Arrays;

// in place sorting algorithm
// not stable
// average case and best case complexity O(nlogn)
// worst case complexity O(n2)

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int []arr = {0, 23, 45, 6, 12, 3, 9, 15, 14, 13, 45, 0, 6, 100, 2, 5, 34, 5};
		qs.quickSort(0, arr.length-1, arr);//ms.merge(arr1,arr2);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public void quickSort(int start, int end, int[] arr) {
		int pivot = arr[end];
		
		int i = start, j = end-1;
		
		if(i==j) { // handles 2 data
			if(arr[i]>pivot) {
				arr[end] = arr[i];
				arr[i] = pivot;
			}
			return;
		}
		
		while(i<=j) {
			if(arr[i]>pivot && arr[j]<pivot) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			
			if(arr[i]<=pivot) i++;
			if(arr[j]>=pivot) j--;
			
			if(i==j && arr[i]>pivot) {
				arr[end] = arr[i];
				arr[i] = pivot;
				break;
			}
			
		}
		
		// if i > j then
		if(arr[i]>pivot) {
			arr[end] = arr[i];
			arr[i] = pivot;
		}else if(arr[j]>pivot) {
			arr[end] = arr[j];
			arr[j] = pivot;
		}
		
		if(i-1>start) quickSort(start, i-1, arr);
		if(i+1<end) quickSort(i+1, end, arr);
	}

}
