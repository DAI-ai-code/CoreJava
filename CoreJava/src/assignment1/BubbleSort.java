
package assignment1;

public class BubbleSort {
	
	public static int[] bubbleSort(int array[]) {
		int n = array.length;
		
		for(int j = n; j > -1; j--) {		
			for (int i= 0; i < j-1; i++) {
				if(array[i] > array[i+1]) {
					int temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		
		return array;
	}
	
	public static void main(String args[]) {
		int array[] = {5, 3, 1, 4, 2, 8, 6, 9, 7,10,7,7,9,9};
		array = bubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

}
