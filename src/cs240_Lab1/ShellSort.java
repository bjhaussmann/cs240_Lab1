/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau
 * Includes recursive and iterative methods to shell sort an array.
 */
public class ShellSort {

	/**
	 * Iteratively implements shell sort on an entire array.
	 * @param array	Array to be sorted
	 * @return	array	Sorted array.
	 */
	public int[] iterativeSort (int[] array)
	{
		
		return array;
	}
	
	/**
	 * Recursively implements shell sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort (int[] array)
	{
		return recursiveSort(array, 0);
	}

	/**
	 * Recursively implements shell sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @param index	Index to start anywhere in the array.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort(int[] array, int index) {
		
		recursiveSort(array, index++);
		return array;
	}
}
