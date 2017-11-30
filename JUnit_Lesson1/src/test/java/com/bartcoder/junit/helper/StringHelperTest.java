package com.bartcoder.junit.helper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	//Test must be always public void to run this test
	// Annotations are since JE 1.5 and nowadays convention testMethodName is not needed
	StringHelper helper;
	
	@Before
	public void makeHelperInstance() {
		helper = new StringHelper();
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}
	
	@Test
	public void testTruncateAInFirst2Position_OneLetter() {
		assertEquals("", helper.truncateAInFirst2Positions("A"));
	}
	
	@Test
	public void testTruncateAInFirst2Position_WordWithoutA() {
		assertEquals("TOJESTTO", helper.truncateAInFirst2Positions("TOJESTTO"));
	}
	
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame_isPositive() {
		assertTrue(helper.areFirstAndLastTwoCharactersSame("ABAB"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersSame_isFalse() {
		assertFalse(helper.areFirstAndLastTwoCharactersSame("ABCD"));
	}
}
