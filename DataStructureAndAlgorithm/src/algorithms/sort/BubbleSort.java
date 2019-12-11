package algorithms.sort;

public class BubbleSort {
	
	int[] arr1 = {34,5,23,6,9,10};
	
	public void sort() {
		int[] arr = {34,5,23,6,9,10};
		for(int m=0;m<arr.length;m++) {
			
			boolean flag = true;
			int i = 0;
			for(int j=i+1;j<arr.length-m;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag = false;
				}
				i++;
			}
			if (flag) {
				break;
			}
		}
		arr1 = arr;
	}
	
	public void print() {
		for(int i=0;i<arr1.length;i++)
			System.out.print(arr1[i] + " ");
	}

	public static void main(String[] args) {
		BubbleSort b = new BubbleSort();
		b.sort();
		b.print();

	}

}
