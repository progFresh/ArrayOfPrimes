package Array_creator;

/**
* RandomArrayCreator allow generate random
* number and array of random numbers of
* "length" dimension.
*
* @author  Polozov Sergey
* @version 1.0
* @since   2017-11-12
*/

public interface RandomArrayCreator {

	/**
	   * Generates random number
	   * @return int This returns generated random number
	   */ 

	public int getRandomNumber();

	/**
	   * This method is used to generate array of 
	   * numbers of "length" dimension
	   * 
	   * @param length This parameter get int value and 
	   * is dimension of array.
	   * @return int[] This returns generated array of 
	   * numbers.
	   */

	public int[] getRandomArray(int length);
}