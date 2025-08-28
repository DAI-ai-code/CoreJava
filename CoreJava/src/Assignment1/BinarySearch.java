package Assignment1;

public class BinarySearch {

	public static int binarySearch(int array[], int number) {
		int start = 0;
		int end = array.length;
		while(start<end) {
			int mid = (start + end)/2;
			if (number == array[mid]) {
				return mid;
			}
			if(number < array[mid]) {
				end = mid-1;
			}
			else {
				start = mid+1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int ans = binarySearch(a,5);
		if (ans == -1) {
			System.out.println("Number not found in the array.");
		}
		else {
			System.out.println("The number you want is at index: " + ans);
		}
	}

	
}
