/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to radix sort an
 *         array.
 */
public class RadixSort {

	/**
	 * Iteratively implements radix sort on an entire array.
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
	 * Recursively implements radix sort on the entire array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array) {
		if (array == null) {
			return array;
		}
		return recursiveSort(array, 0);
	}

	/**
	 * Recursively implements radix sort with a separate index parameter to start
	 * sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array, int index) {
		if (array == null) {
			return array;
		}
		recursiveSort(array, index++);
		return array;
	}
}
