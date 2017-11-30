package com.bartcoder.junit.helper;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class StringHelperSameCharactersTrueParameterizedTest {

	StringHelper helper = new StringHelper();
	private String input;
	private Boolean expectedOutput;
	
	public StringHelperSameCharactersTrueParameterizedTest(String input, Boolean expectedOutput) {
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	
	@Parameters
	public static Collection<Object[]> testCondition() {
//		Objects[][] constructorFields = {{"ABAB", true} ,{"ABCAB", true}, {"ABCABCAB" ,true}, {"TAAKT", false}};
		return Arrays.asList(new Object[][]{{"ABAB", true} ,{"ABCAB", true}, {"ABCABCAB" ,true}, {"TAAKT", false}});
	}
	
	@Test
	public void testAreCharactersRightNot() {
//		assertTrue(helper.areFirstAndLastTwoCharactersSame(input));
		assertEquals(helper.areFirstAndLastTwoCharactersSame(input),(expectedOutput));
	}
	
	


}
