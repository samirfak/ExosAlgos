package exos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TestPalindrome {
	int a, b, c, d, e, f;
	@Before
	public void setUp() throws Exception {
		 a = 121;
		 b = 2112;
		 c = 2121;
		 d = 41514;
		 e = 0;
		 f = 333;
	}

	@Test
	public void testa() {
		assertTrue(Palindrome.isPalindrome(a));
	}
	
	@Test
	public void testb() {
		assertTrue(Palindrome.isPalindrome(b));
	}
	
	@Test
	public void testc() {
		assertFalse(Palindrome.isPalindrome(c));
	}
	
	@Test
	public void testd() {
		assertTrue(Palindrome.isPalindrome(d));
	}
	
	@Test
	public void teste() {
		assertTrue(Palindrome.isPalindrome(e));
	}
	
	@Test
	public void testf() {
		assertTrue(Palindrome.isPalindrome(f));
	}

}
