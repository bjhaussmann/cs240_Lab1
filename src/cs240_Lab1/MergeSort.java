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
	 * Recursively implements merge sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @return array Sorted array.
	 */

	public int[] recursiveSort(int[] array) {
	if (array == null) {
		return array;
	}
		return recursiveSort(array, 0, array.length - 1);
	}

	/**
	 * Recursively implements merge sort with separate parameters for the beginning
	 * and end of sorting area.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param left
	 *            Beginning of sorting area.
	 * @param right
	 *            End of sorting area.
	 * @return array Sorted array.
	 */
	public int[] recursiveSort(int[] array, int left, int right) {
		if (right > left) {
			int mid = (right + left) / 2;
			recursiveSort(array, left, mid);
			recursiveSort(array, (mid + 1), right);
			merge(array, left, mid, right);
		}
		return array;
	}

	/**
	 * Merge sorted arrays back together.
	 * 
	 * @param array
	 *            Array to be merged
	 * @param left
	 *            Beginning of sorting area.
	 * @param mid
	 *            Middle of sorting area.
	 * @param right
	 *            End of sorting area.
	 * @return array Sorted array.
	 */
	public int[] merge(int[] array, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;
		
		int l[] = new int [n1];
		int r[] = new int[n2];
		
		for ( int i = 0; i < n1; i++)
		{
			l[i] = array[left+i];
		}
		for (int i =0; i<n2; i++)
		{
			r[i] = array[mid+1+i];
		}
		
		for (int i = 0; i < n1; i++)
		{
			array[i] = l[i];
		}
		for(int i =n1;i<n2;i++)
		{
			array[i] = l[i];
		}
		return array;
	}
}