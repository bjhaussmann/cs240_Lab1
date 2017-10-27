/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to merge sort an
 *         array.
 */
public class MergeSort {

	/**
	 * Iteratively implements merge sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] iterativeSort(int[] array) {
		if (array == null) {
			return array;
		}

		for (int i = array.length; i > 0; i /= 2) {
			int mid = array.length / 2;

			int[] left = new int[mid];
			for (int j = 0; j < mid; j++) {
				left[j] = array[j];
			}

			int[] right = new int[array.length - mid];
			for (int j = mid; j < array.length; j++) {
				right[j - mid] = array[j];
			}

			int j = 0;
			int k = 0;
			int l = 0;

			while (j < left.length && k < right.length) {
				if (left[j] < right[k]) {
					array[l] = left[j];
					j++;
				} else {
					array[l] = right[k];
					k++;
				}
				l++;
			}

			while (j < left.length) {
				array[l] = left[j];
				j++;
				l++;
			}

			while (k < right.length) {
				array[l] = right[k];
				k++;
				l++;
			}
		}
		return array;
	}

	/**
	 * Recursively implements merge sort on the entire array.
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
	 * Recursively implements merge sort with a separate index parameter to start
	 * sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param index
	 *            Index to start anywhere in the array.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array, int index) {
		if (array == null) {
			return array;
		}

		if (array.length > 1) {
			int mid = array.length / 2;

			int[] left = new int[mid];
			for (int i = 0; i < mid; i++) {
				left[i] = array[i];
			}

			int[] right = new int[array.length - mid];
			for (int i = mid; i < array.length; i++) {
				right[i - mid] = array[i];
			}
			recursiveSort(left);
			recursiveSort(right);

			int i = 0;
			int j = 0;
			int k = 0;

			while (i < left.length && j < right.length) {
				if (left[i] < right[j]) {
					array[k] = left[i];
					i++;
				} else {
					array[k] = right[j];
					j++;
				}
				k++;
			}

			while (i < left.length) {
				array[k] = left[i];
				i++;
				k++;
			}

			while (j < right.length) {
				array[k] = right[j];
				j++;
				k++;
			}
		}
		return array;
	}
}
