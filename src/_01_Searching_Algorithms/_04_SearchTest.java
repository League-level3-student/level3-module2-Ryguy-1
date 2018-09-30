package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	
	public void testLinearSearch() {
		String[] words = {"apple", "grape", "firehydrant", "cuecumber", "SpaceX"};
		//1. use the assertEquals method to test your linear search method.
		assertEquals(3, _00_LinearSearch.linearSearch(words, "cuecumber"));
		assertEquals(0, _00_LinearSearch.linearSearch(words, "apple"));
		assertEquals(4, _00_LinearSearch.linearSearch(words, "SpaceX"));
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		assertEquals(0, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 1));
		assertEquals(6, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 7));
		assertEquals(8, _01_BinarySearch.binarySearch(numbers, 0, numbers.length, 9));
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
	}
}
