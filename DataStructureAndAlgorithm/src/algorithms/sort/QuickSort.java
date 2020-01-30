package algorithms.sort;

import java.util.Arrays;

// in place sorting algorithm
// not stable
// average case and best case complexity O(nlogn)
// worst case complexity O(n2)

public class QuickSort {

	public static void main(String[] args) {
		QuickSort qs = new QuickSort();
		int []arr = {0, 23, 45, 6, 7, 12, 3, 9, 15, 0, 0, 0, 1, 1, 1, 14, 33, 34, 13, 45, 0, 6, 100, 2, 5, 34, 5};
		qs.quickSort(0, arr.length-1, arr);//ms.merge(arr1,arr2);
		
		System.out.println(Arrays.toString(arr));

	}
	
	public void quickSort(int start, int end, int[] arr) {
		int pivot = arr[end];
		
		int i = start, j = end-1;
		
		if(i==j) { // handles 2 data
			if(arr[i]>pivot) {
				swap(end,i,arr);
			}
			return;
		}
		
		while(i<=j) {
			if(arr[i]>pivot && arr[j]<pivot) {
				swap(i,j,arr);
			}
			
			if(arr[i]<=pivot) i++;
			if(arr[j]>=pivot) j--;
			
			if(i==j && arr[i]>pivot) {
				swap(end,i,arr);
				break;
			}
			
		}
		
		// if i > j then
		if(arr[i]>pivot) {
			swap(end,i,arr);
		}else if(arr[j]>pivot) {
			swap(end,j,arr);
		}
		
		if(i-1>start) quickSort(start, i-1, arr);
		if(i+1<end) quickSort(i+1, end, arr);
	}
	
	public void swap(int i, int j, int[]arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
