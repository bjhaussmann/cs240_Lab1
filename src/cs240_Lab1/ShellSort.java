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
		int countMove = 0;
		int countCompare = 0;
		for (int i = array.length / 2; i > 0; i /= 2) {
			for (int j = i; j < array.length; j++) {
				int temp = array[j];
				int k;
				countCompare++;
				for (k = j; k >= i && array[k - i] > temp; k -= i) {
					array[k] = array[k - i];
					countMove++;
				}
				array[k] = temp;
			}
		}
		System.out.println("Moves:\t" + countMove + "\nCompares:\t" + countCompare);
		return array;
		
	}

	/**
	 * Recursively implements shell sort with a specified step.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param step
	 *            Steps to sort array by.
	 * @return array The sorted array.

	 */
	public int[] recursiveSort(int[] array) {
		if (array == null) {
			return array;
		}
		int step = hubbardSequence(array.length);
		return recursiveSort(array, step, step);
	}

	/**
	 * Finds the correct step for shell sort based on the Hubbard Sequence.
	 * 
	 * @param length
	 *            Length of the array to be sorted.
	 * @return previous Correct step to use for shell sort based on the Hubbard
	 *         Sequence.
	 */
	public int hubbardSequence(int length) {
		int step = 1;
		int previous = 1;

		while (step < (length / 2)) {
			previous = step;
			step = (2 * previous) + 1;
		}

		return previous;
	}

	/**
	 * Recursively implements shell sort with a separate parameters to facilitate
	 * custom step sorting.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @param currentStep
	 *            Current divisor of the array.
	 * @param stepper
	 *            Step to sort the array by.
	 * @return array Sorted array.
	 */
	private int[] recursiveSort(int[] array, int currentStep, int stepper) {
		int step = array.length / currentStep;
		
		if (step >= 1) {
			for (int i = step; i < array.length; i++) {
				int temp = array[i];
				int j;
				for (j = i - step; j >= 0 && array[j] > temp; j -= step) {
					array[j + step] = array[j];
				}
				array[j + step] = temp;
			}
			recursiveSort(array, currentStep * stepper, stepper);
		}
		return array;
	}
}
