/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau
 * Includes recursive and iterative methods to insertion sort an array.
 */
public class InsertionSort {

	/**
	 * Iteratively implements insertion sort on entire array.
	 * @param Array	array to be sorted
	 * @return	Array	sorted array
	 */
	public int[] iterativeSort (int[] array)
	{
		for (int i = 1; i < array.length; i++)
		{
			int key = array[i];
			int j = i - 1;
			while ( j >= 0 && array[j] > key)
			{
				array[j + 1] = array [j];
				j = j - 1;
			}
			array [j + 1] = key;
		}
		return array;
	}
	
	/**
	 * Recursively implements selection sort on entire array.
	 * @param array	Array to be sorted
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort (int[] array)
	{
		return recursiveSort(array, 0);
	}

	/**
	 * Recursively implements selection sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @param index	Index to start anywhere in the array.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort(int[] array, int index) {
		
		recursiveSort(array, index++);
		return array;
	}
}
