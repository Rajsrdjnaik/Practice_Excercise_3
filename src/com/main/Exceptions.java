package com.main;

public class Exceptions {

	   public static String negative() {
	       try {
	          int a[] = new int[-2];
	       }
	       catch(NegativeArraySizeException e) {
	           return "Negative ArraySize";
	       }
	    return null;
	   }
	   public static String IndexOutOfBound() {
	       try {
	          int a[] = new int[2];
	          a[3] = 0;
	       }
	       catch(IndexOutOfBoundsException e) {
	           return "Index out of bounds";
	       }
	    return null;
	   }
	   public static String NullPointer() {
	       try {
	            Exceptions excep = null;
	       }
	       catch(NullPointerException e)
	       {
	           System.out.print("NullPointerException Caught");
	       }
	    return null;
	   }
}
