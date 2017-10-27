/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to quick sort an
 *         array.
 */
public class QuickSort {

	/**
	 * Iteratively implements quick sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] iterativeSort(int[] array) {
		if (array == null) {
			return array;
		}
		return array;
	}

	/**
	 * Recursively implements quick sort on the entire array
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array) {
		if (array == null) {
			return array;
		}
		return recursiveSort(array, 0, array.length);
	}

	/**
	 * Recursively implements quick sort with a separate index parameters to start
	 *  and end sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param low
	 *            Beginning index.
	 * @param high
	 *            Ending index.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array, int low, int high) {
		if (array == null) {
			return array;
		}

		if (low < high) {

		}
		recursiveSort(array, low, high);
		return array;
	}
}
