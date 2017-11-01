/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to selection sort an
 *         array.
 */
public class SelectiveSort {

	/**
	 * Iteratively implements selection sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] iterativeSort(int[] array) {
		if (array == null) {
			return array;
		}
		int temp = 0;
		int min = 0;
		int countMove = 0;
		int countCompare = 0;

		for (int i = 0; i < array.length - 1; i++) {
			min = i;
			for (int j = i + 1; j < array.length; j++) {
				countCompare++;
				if (array[j] < array[min]) {
					min = j;
					countMove++;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		System.out.println("Moves:\t" + countMove + "\nCompares:\t" + countCompare);
		return array;
	}

	/**
	 * Recursively implements selection sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array
	 */
	public int[] recursiveSort(int[] array) {
		if (array == null) {
			return array;
		}
		return recursiveSort(array, 0);
	}

	/**
	 * Recursively implements selection sort with a separate index parameter to
	 * start sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param index
	 *            Index to start anywhere in the array.
	 * @return array Sorted array
	 */
	public int[] recursiveSort(int[] array, int index) {
		if (array == null) {
			return array;
		}
		int temp = 0;
		int min = index;

		for (int i = index + 1; i < array.length; i++) {
			if (array[i] < array[min]) {
				min = i;
			}
			temp = array[min];
			array[min] = array[index];
			array[index] = temp;
		}
		recursiveSort(array, index++);
		return array;
	}
}
