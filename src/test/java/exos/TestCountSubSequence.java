package exos;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCountSubSequence {

	@Test
	public void test1() {
		System.out.println (CountSubSequence.countSubSequence("babgbag", "bag" ));
	
		assertEquals(CountSubSequence.countSubSequence("babgbag", "bag" ), 5);
	}
	
	@Test
	public void test2() {
		assertEquals(CountSubSequence.countSubSequence("ABCABBC", "ABC"), 6);
	}
	
	@Test
	public void test3() {
		assertEquals(CountSubSequence.countSubSequence("rabbbit", "rabbit"), 3);
	}
	
	@Test
	public void test4() {
		assertEquals(CountSubSequence.countSubSequence("ABCBBC", "BAC"), 0);
	}

}
