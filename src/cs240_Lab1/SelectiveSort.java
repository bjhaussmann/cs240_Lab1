/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau
 * Includes recursive and iterative methods to selection sort an array.
 */
public class SelectiveSort {

	/**
	 * Iteratively implements selection sort on an entire array.
	 * @param array	Array to be sorted
	 * @return	array	Sorted array.
	 */
	public int[] iterativeSort (int[] array)
	{
		int temp = 0;
		int min = 0;
		
		for (int i = 0; i < array.length - 1; i++)
		{
			min = i;
			for ( int j = i + 1; j < array.length; j++)
			{
				if (array[j] < array[min])
				{
					min = j;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array [i] = temp;
		}
		return array;
	}
	
	/**
	 * Recursively implements selection sort on an entire array.
	 * @param array	Array to be sorted
	 * @return	array	Sorted array
	 */
	public int[] recursiveSort (int[] array)
	{
		return recursiveSort (array, 0);
	}

	/**
	 * Recursively implements selection sort with a separate index parameter to start sorting at any part of the array.
	 * @param array	Array to be sorted.
	 * @param index	Index to start anywhere in the array.
	 * @return	array	Sorted array
	 */
	public int[] recursiveSort(int[] array, int index) {
		int temp = 0;
		int min = index;
		
		for (int i = index + 1; i < array.length; i++)
		{
			if (array[i] < array[min])
			{
				min = i;
			}
			temp = array[min];
			array[min] = array[index];
			array [index] = temp;
		}
		recursiveSort(array, index++);
		return array;
	}
}
