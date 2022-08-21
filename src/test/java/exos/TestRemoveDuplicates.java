package exos;

import org.junit.Test;

public class TestRemoveDuplicates {
	int[] nums1 = {1,1,2}; // Input array
	int[] expectedNums1 = {1,2}; // The expected answer with correct length
	int[] nums2 = {0,0,1,1,1,2,2,3,3,4}; // Input array
	int[] expectedNums2 = {0,1,2,3,4};
	
	@Test
	public void test1() {
		int k = RemoveDuplicates.removeDuplicates(nums1); // Calls your implementation

		assert k == expectedNums1.length;
		for (int i = 0; i < k; i++) {
		    assert nums1[i] == expectedNums1[i];
		}
	}
	
	@Test
	public void test2() {
		int k = RemoveDuplicates.removeDuplicates(nums2); // Calls your implementation

		assert k == expectedNums2.length;
		for (int i = 0; i < k; i++) {
		    assert nums2[i] == expectedNums2[i];
		}
	}


}
