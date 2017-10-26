/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau
 * Includes recursive and iterative methods to radix sort an array.
 */
public class RadixSort {

	/**
	 * Iteratively implements radix sort on an entire array.
	 * @param array	Array to be sorted
	 * @return	array	Sorted array.
	 */
	public int[] iterativeSort (int[] array)
	{
		
		return array;
	}
	
	/**
	 * Recursively implements radix sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort (int[] array)
	{
		return recursiveSort(array, 0);
	}

	/**
	 * Recursively implements radix sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort(int[] array, int index) {
		
		recursiveSort(array, index++);
		return array;
	}
}
