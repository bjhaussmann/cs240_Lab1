/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to shell sort an
 *         array.
 */
public class ShellSort {

	/**
	 * Iteratively implements shell sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] iterativeSort(int[] array) {
		if (array == null) {
			return array;
		}

		for (int gap = array.length / 2; gap > 0; gap /= 2) {
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];

				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
					array[j] = array[j - gap];
				}

				array[j] = temp;
			}
		}
		return array;
		
	}

	/**
	 * Recursively implements shell sort on the entire array.
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
	 * Recursively implements shell sort with a separate index parameter to start
	 * sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param index
	 *            Index to start anywhere in the array.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array, int gap) {
		if (array == null) {
			return array;
		}

		gap = array.length / 2;
		if (gap > 0) {
			for (int i = gap; i < array.length; i++) {
				int temp = array[i];

				int j;
				for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
					array[j] = array[j - gap];
				}

				array[j] = temp;
			}
		}
		recursiveSort(array, gap);
		return array;
	}
}
