/**
 * 
 */
package cs240_Lab1;

import java.util.Random;

/**
 * @author bjhau
 * Creates and initializes an array of inputed or defaulted (10) size and
 * populates it with random numbers less than 1000.
 */
public class Initialize {

	private int[] array;
	private static int length = 10;	//default array size.

	public Initialize ()
	{
		this(length);
	}
	
	public Initialize (int length)
	{
		array = new int[length];
	}
	
	/**
	 * Populates the initialized array with random integers under 1000.
	 * @return	array	Filled array.
	 */
	public int[] init ()
	{
		Random rnd = new Random(System.currentTimeMillis());
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = rnd.nextInt(1000);
		}
		return array;
	}
}
