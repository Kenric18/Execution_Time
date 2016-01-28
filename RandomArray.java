import java.lang.Math;
import java.util.Arrays;

public class RandomArray {

	private int[] array;

	/**
	* @desc creates a constructor for a creating an array of random intergers
	* @param int N - the number of random integers
	*
	**/
	public RandomArray(int n) {
		array = new int[n];
		for (int i=0; i < n; i++) {
			double value = Math.random()*100;
			array[i] = (int)value;
		}
	}

	/**
	* @desc print statement of the array
	* @return print elements of the array
	*/

	public void printArray() {
		for (int k=0; k<array.length; k++) {
			System.out.println(array[k]);
		}
	}

	/**
	* @desc sort array
	*/

	public void sortArray() {
		Arrays.sort(array);
	}

	/**
	* @desc searches for an integer within an array
	* @param int number - the number that is to be located
	* @return int index - the number that is found (if found)
	*/

	public int searchInteger(int number) {
		int index = Arrays.binarySearch(array, number);
		return index;
	}
}