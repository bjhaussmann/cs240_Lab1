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
		int temp = 0;
		for (int i =0; i < array.length; i+=2)
		{
			if(array[i] > array[i+1])
			{
				temp = array[i];
				array[i] = array[i+1];
				array[i+1] = temp;
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