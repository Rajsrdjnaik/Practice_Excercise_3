package com.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.main.MatrixSum;

class MatrixSumTest {

	@Test
	void test() {
		int[][] a = {{1,2},{4,5}};
		int[][] b = {{2,3},{5,6}};
		MatrixSum obj = new MatrixSum();
		int[][] arr = obj.addMatrix(a, b);
		assertEquals(3,arr[0][0]);
		assertEquals(5,arr[0][1]);
		assertEquals(9,arr[1][0]);
		assertEquals(11,arr[1][1]);
	}

}
