package exos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestValidParenthesis {
	String s1, s2, s3, s4, s5, s6;
	@Before
	public void setUp() throws Exception {
		s1 = "()";
		s2 = "(]";
		s3 = "()[]";
		s4 = "{([])}";
		s5 = "({[}])";
		s6 = "({}[])";
	}

	@Test
	public void test1() {
		assertTrue(ValidParenthesis.isValid(s1));
	}
	
	@Test
	public void test2() {
		assertFalse(ValidParenthesis.isValid(s2));
	}
	
	@Test
	public void test3() {
		assertTrue(ValidParenthesis.isValid(s3));
	}
	
	@Test
	public void test4() {
		assertTrue(ValidParenthesis.isValid(s4));
	}
	
	@Test
	public void test5() {
		assertFalse(ValidParenthesis.isValid(s5));
	}
	
	@Test
	public void test6() {
		assertTrue(ValidParenthesis.isValid(s6));
	}

}
