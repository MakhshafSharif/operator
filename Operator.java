package com.test;

import java.util.ArrayList;
import java.util.List;

public class Operator extends Operations{
	
	public String reverse(String str) {
		//Separate * from other char
		List<Character> charList = null;;
		char[] actualArr = str.toCharArray();
		for (char elemet : actualArr) {
			if(elemet == '*') {
				continue;
			}
			if(charList == null) {
				charList = new ArrayList<>();
			}
			charList.add(elemet);
		}
		//reverse the array
		char[] reverseArr = new char[actualArr.length];
		int charArrSize = charList.size();
		for (int i=0; i<actualArr.length; i++)  {
			if(actualArr[i] == '*') {
				reverseArr[i] = actualArr[i]; 
			}else {
				reverseArr[i] = charList.get(charArrSize-1);
				charArrSize --;
			}
			
		}
		
		return String.copyValueOf(reverseArr);
		
	}

}
