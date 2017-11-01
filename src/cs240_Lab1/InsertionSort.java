/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to insertion sort an
 *         array.
 */
public class InsertionSort {

	/**
	 * Iteratively implements insertion sort on entire array.
	 * 
	 * @param Array
	 *            array to be sorted
	 * @return Array sorted array
	 */
	public int[] iterativeSort(int[] array) {
		if (array == null) {
			return array;
		}
		int countMove = 0;
		int countCompare = 0;
		
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			countMove++;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
				countCompare++;
			}
			array[j + 1] = key;
		}
		System.out.println("Moves:\t" + countMove + "\nCompares:\t" + countCompare);
		return array;
		
	}

	/**
	 * Recursively implements selection sort on entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array) {
		if (array == null) {
			return array;
		}
		return recursiveSort(array, array.length);
	}

	/**
	 * Recursively implements selection sort on an array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param length
	 *            Length of array to be sorted.
	 * @return array Sorted array.
	 */
	private int[] recursiveSort(int[] array, int length) {
		if (length <= 1) {
			return array;
		}
		recursiveSort(array, length - 1);
		int last = array[length - 1];
		int j = length - 2;
		while (j >= 0 && array[j] > last) {
			array[j + 1] = array[j];
			j--;
		}
		array[j + 1] = last;

		return array;
	}
}
