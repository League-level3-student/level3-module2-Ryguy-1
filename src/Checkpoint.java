
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//1.	Create a new Java class called Checkpoint
public class Checkpoint {
	// 2.	Add a main method to the class
	public static void main(String[] args) {
		double[] doubles = {1.2,9,6.4,3};
		double[] sortedDoubles = {1.2,3,6.4,9};
		sortDoubles(doubles);
		for (int i = 0; i < doubles.length; i++) {
			System.out.println(doubles[i]);
		}
		assertEquals(sortedDoubles[2], sortDoubles(doubles)[2]);
		
		int[] ints = {1,2,3,4,5,6,7,8,9};
		assertTrue(sortInts(ints, 7));
		assertFalse(sortInts(ints, 0));
	}
   

	static double[] sortDoubles(double[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[j]>array[i]) {
					double temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}
	static boolean sortInts(int[] array, int x) {
		for (int i = 0; i < array.length; i++) {
			if(array[i]==x) {
				return true;
			}
		}
		return false;
		
	}
	
  //  3.	Create a method that takes in an array of doubles and sorts it using any
  //      method you choose. Use your main method to test it.

 //   4.	Create a method that takes in an array of integers and a single integer. Return true
 //       if the single integer is contained in the array. Otherwise, return false.
 //       Use your main method to test it.


//EXTRA: Sort the array of doubles in reverse order.
//EXTRA: Create a new method that takes an array of Strings and sorts them in alphabetical order.
//EXTRA: Use a searching algorithm that is not a linear search.
}
