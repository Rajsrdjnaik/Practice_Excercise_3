package com.main;

public class MatrixSum {
	
	public int[][] addMatrix(int[][] a, int[][] b)
	{
		int[][] c = new int[2][2];
		for(int i=0; i< a.length; i++)
		{
			for(int j =0 ; j< a[0].length; j++)
			c[i][j] = a[i][j] + b[i][j];
		}
		System.out.println(c);
		return c;
	}
}
