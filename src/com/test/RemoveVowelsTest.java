package com.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import com.main.RemoveVowels;
class RemoveVowelsTest {

	@Test
	void test() {
		String strInput = "Rajat";
		String exp = "Rjt";
        RemoveVowels obj = new RemoveVowels();
        String str= obj.removeVowel(strInput);
        assertEquals(exp,str);
	}	
}