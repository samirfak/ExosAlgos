package exos;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class TestTwoSum {
	int[] nums1 = {2,7,11,15};
	int[] nums2 = {3,2,4};
	int[] nums3 = {3,3};
	int[] res = new int[2];
	

	@Test
	public void test1() {
		res = TwoSum.twoSum(nums1, 9);
		//System.out.println(res[1]);
		int[] trueRes = {0, 1};
		assertTrue(Arrays.equals(res, trueRes));
	}
	
	@Test
	public void test2() {
		res = TwoSum.twoSum(nums2, 6);
		//System.out.println(res[1]);
		int[] trueRes = {1, 2};
		assertTrue(Arrays.equals(res, trueRes));
	}
	
	@Test
	public void test3() {
		res = TwoSum.twoSum(nums3, 6);
		//System.out.println(res[1]);
		int[] trueRes = {0, 1};
		assertTrue(Arrays.equals(res, trueRes));
	}

}
