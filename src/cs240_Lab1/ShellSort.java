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
		for (int i = array.length / 2; i > 0; i /= 2)
		{
			for (int j = i; j < array.length; j++)
			{
				int temp = array[j];
				int k;
				for ( k = j; k >= array.length && array[k - array.length] > temp; k -= array.length)
				{
					array[k] = array[k - array.length];
				}
				array[k] = temp;
			}
		}
		return array;
	}
	
	/**
	 * Recursively implements shell sort with a step of 2.
	 * @param array	Array to be sorted.
	 * @return	array	Sorted array.
	 */
	public int[] recursiveSort (int[] array)
	{
		return recursiveSort(array, 2, 2);
	}

	/**
	 * Recursively implements shell sort with a specified step.
	 * @param array Array to be sorted.
	 * @param step	Steps to sort array by.
	 * @return	array	The sorted array.
	 */
	public int[] recursiveSort( int[] array, int step)
	{
		if (step < 1)
		{
			step = 2;
		}
		return recursiveSort(array, step, step);
	}
	/**
	 * Recursively implements shell sort with a separate parameters to facilitate custom step sorting.
	 * @param array	Array to be sorted.
	 * @param currentStep Current divisor of the array.
	 * @param stepper Step to sort the array by.
	 * @return	array	Sorted array.
	 */
	private int[] recursiveSort(int[] array, int currentStep, int stepper) {
		int step = array.length / currentStep;
		if (step >= 1)
		{
			for (int i = step; i < array.length; i++)
			{
				int temp = array[i];
				int j;
				for(j = i - step; j >= 0 && array[j] > temp; j -= step)
				{
					array[j + step] = array[j];
				}
				array[j + step] = temp;
			}
			recursiveSort(array, currentStep * stepper, stepper);
		}
		
		return array;
	}
}
