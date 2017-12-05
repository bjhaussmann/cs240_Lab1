/**
 * 
 */
package cs240_Lab1;

/**
 * @author bjhau Includes recursive and iterative methods to radix sort an
 *         array.
 */
public class RadixSort {

	/**
	 * Iteratively implements radix sort on an entire array.
	 * 
	 * @param array
	 *            Array to be sorted
	 * @return array Sorted array.
	 */
	public int[] iterativeSort(int[] array, int n) {
		if (array == null) {
			return array;
		}
		int m = getMax(array, n);

		for (int exp = 1; m/exp > 0; exp *= 10){
			countSort(array, n, exp);
			++countCompare;
		}
		return array;
		
	}

	static int countMove = 0;
    static int countCompare = 0;
    
	
	static int getMax(int arr[], int n)
	{
		int mx = arr[0];
		for (int i = 1; i < n; i++){
		    ++countCompare;
			if (arr[i] > mx){
				mx = arr[i];
		}
	}
		return mx;
	}

	static void countSort(int arr[], int n, int exp)
	{
		int output[] = new int[n]; 
		int i;
		int count[] = new int[10];

		for (i = 0; i < n; i++){
			count[ (arr[i]/exp)%10 ]++;
			++countMove;
			++countCompare;
	}

		for (i = 1; i < 10; i++){
			count[i] += count[i - 1];
			++countCompare;
			++countMove;
		}

		for (i = n - 1; i >= 0; i--)
		{
			output[count[ (arr[i]/exp)%10 ] - 1] = arr[i];
			count[ (arr[i]/exp)%10 ]--;
			++countMove;
			++countCompare;
		}

		for (i = 0; i < n; i++)
			arr[i] = output[i];
	}
	

	/**
	 * Recursively implements radix sort with a separate index parameter to start
	 * sorting at any part of the array.
	 * 
	 * @param array
	 *            Array to be sorted.
	 * @return array Sorted array.
	 */
	public void recursiveSort(int[] array1, int[] array2, int exp, int m, int index) {
		 while(exp > 0)
 		{
 			if (m / exp < 0)
 				return;
 			else
 			{
             
                 for (int i = 0; i < index; i++)
                     array2[(array2[i] / exp) % 10]++;
                 for (int j = 1; j < 10; j++)
                     array2[j] += array2[j - 1];
                 for (int k = index - 1; k >= 0; k--)
                     array1[--array2[(array2[k] / exp) % 10]] = array2[k];
                 for (int a = 0; a < index; a++)
                     array2[a] = array1[a];
                 exp *= 10; 
                 recursiveSort(array2, array1,exp, m, index);
 			}
 		}
	}
}
