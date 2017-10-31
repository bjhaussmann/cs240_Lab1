/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau
 *
 */

public class Main {
	/**
	 * @param args
	 */
	@SuppressWarnings("null")
	public static void main(String[] args) {

		int[] array;
		Initialize arr = null;
		array = arr.init();
		
		SelectiveSort select = new SelectiveSort();
		array = select.iterativeSort(array);
		array = select.recursiveSort(array);

		InsertionSort insert = new InsertionSort();
		array = insert.iterativeSort(array);
		array = insert.recursiveSort(array);

		ShellSort shell = new ShellSort();
		array = shell.iterativeSort(array);
		array = shell.recursiveSort(array);

		MergeSort merge = new MergeSort();
		array = merge.iterativeSort(array);
		array = merge.recursiveSort(array);

		QuickSort quick = new QuickSort();
		array = quick.iterativeSort(array);
		array = quick.recursiveSort(array);

		RadixSort radix = new RadixSort();
		array = radix.iterativeSort(array);
		array = radix.recursiveSort(array);
		
	}
}
