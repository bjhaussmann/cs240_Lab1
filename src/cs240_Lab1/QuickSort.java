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

	static int countMove = 0;
	static int countCompare = 0;

	int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {

			if (arr[j] <= pivot) {
				i++;

				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				++countCompare;
				++countMove;
			}
		}

		int temp = arr[i + 1];
		arr[i + 1] = arr[high];
		arr[high] = temp;
		++countMove;
		++countCompare;

		return i + 1;
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
	 * and end sorting at any part of the array.
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
			int pi = partition(array, low, high);
			++countCompare;

			recursiveSort(array, low, pi - 1);
			recursiveSort(array, pi + 1, high);
		}
		return array;
	}
}
