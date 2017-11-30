package com.bartcoder.junit.helper;

public class StringHelper {

	public String truncateAInFirst2Positions(String str) {
		if(str.length() <= 2)
			return str.replaceAll("A", "");
		
		
		String firts2Chars = str.substring(0, 2);
		String stringMinusFirst2Chars = str.substring(2);
		
		return firts2Chars.replaceAll("A","") + stringMinusFirst2Chars;
	}
	
	
	public boolean areFirstAndLastTwoCharactersSame(String str) {
		if(str.length() <= 1)
			return false;
		if(str.length() == 2)
			return true;
		
		String firstTwoCharacters = str.substring(0, 2);
		String lastTwoCharacters = str.substring(str.length()-2);
		
		return firstTwoCharacters.equals(lastTwoCharacters);
		
	}
}
