package algorithms.search;

public class Binary {
	
	public boolean search(int target, int[] arr) {
		
		int left = 0;
		int right = arr.length-1;
		int mid = (right+left)/2;
		while(left<=right) {
			if(arr[mid]==target) {
				return true;
			} else if(arr[mid]<target) {
				left = mid+1;
			} else {
				right = mid-1;
			}
			
			mid = (right+left)/2;
			
		}
		return false;
	}
	
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

	public static void main(String[] args) {
		int []arr = {23, 45, 6, 12, 3, 9, 13, 11};
		System.out.println(new Binary().search(3, new Binary().sort(arr)));
	}

}
