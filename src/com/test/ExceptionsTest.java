package com.test;

import static org.junit.jupiter.api.Assertions.*;
import com.main.Exceptions;


import org.junit.jupiter.api.Test;

class ExceptionsTest {

	@Test
		public void testNegative() {
			assertEquals("Negative ArraySize" , Exceptions.negative());
		}
    @Test
	    public void testIndexOutOfBound() {
	        assertEquals("Index out of bounds" , Exceptions.IndexOutOfBound());
	    }

}
