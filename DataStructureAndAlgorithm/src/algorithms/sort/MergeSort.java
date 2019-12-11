/**
 * 
 */
package algorithms.sort;

import java.util.Arrays;

/**
 * @author Rubaiyat
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	int[] merge(int[] arr1, int[] arr2 ) {
		
		int[] merged = new int[arr1.length+arr2.length];
		
		int i = 0,j = 0, p = 0;
		
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j]) {
				merged[p] = arr1[i++];
			} else {
				merged[p] = arr2[j++];
			}
			p++;
		}
		
		if(i<=j) {
			for(;i<arr1.length;i++) {
				merged[p++] = arr1[i];
			}
		} else {
			for(;j<arr2.length;j++) {
				merged[p++] = arr2[j];
			}
		}
		
		return merged;
	}
	
	int[] sort(int[] arr, int start, int end) {
		
		if(start>=end) {
			int[] a = {arr[start]};
			return a;
		}
		int mid = (start+end)/2;
		int[] arr1 = sort(arr,start,mid);
		int[] arr2 = sort(arr,mid+1,end);
		
		return merge(arr1,arr2);
	}
	
	public static void main(String[] args) {
		MergeSort ms = new MergeSort();
//		int[] arr1 = {2, 4, 7, 8, 12, 23};
//		int[] arr2 = {3, 9, 13, 16, 23, 24, 40}; 
		int []arr = {23, 45, 6, 12, 3, 9, 15, 14, 13, 45, 0, 100, 2, 5, 34, 6};
		int[] result = ms.sort(arr, 0, arr.length-1);//ms.merge(arr1,arr2);
		
		System.out.println(Arrays.toString(result));

	}

}
