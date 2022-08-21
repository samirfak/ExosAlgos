package exos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestLongestCommonPrefix {
	String[] strs1 = {"flower","flow","flight"};
	String[] strs2 = {"dog","racecar","car"};
	String[] strs3 = {"cat","car","call"};

	@Test
	public void test1() {
		String output = LongestCommonPrefix.longestCommonPrefix(strs1);
		assertEquals(output, "fl");
	}
	
	@Test
	public void test2() {
		String output = LongestCommonPrefix.longestCommonPrefix(strs2);
		assertEquals(output, "");
	}
	
	@Test
	public void test3() {
		String output = LongestCommonPrefix.longestCommonPrefix(strs3);
		assertEquals(output, "ca");
	}

}
