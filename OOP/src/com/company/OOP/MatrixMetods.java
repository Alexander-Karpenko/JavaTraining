package com.company.OOP;

import java.util.Iterator;
import java.util.Random;

public class MatrixMetods {
	

	public static int[][] setRandomMatrix(int lines, int columns) {
		Random rand = new Random();
		int Matrix [][] = new int [lines][columns];
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[0].length; j++) {
				Matrix [i][j] = rand.nextInt(2);
			}
				
		}
		return Matrix;
	}
	
	public static void outMatrix(int Matrix [][]) {
		if (Matrix != null) {
		for (int i = 0; i < Matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < Matrix[0].length; j++) {
			System.out.print(Matrix[i][j] + " ");	
			}
		}
		System.out.println();
		}else {
			System.out.println("");
		}
	}

	public static int [][] SumMatrix (int Matrix1[][], int Matrix2[][]) throws MatrixExeption {
		int ResMatrix[][] = null;
		try {
		if (Matrix1.length == Matrix2.length && Matrix1[0].length ==
					 Matrix2[0].length) {
		ResMatrix = new int[Matrix1.length][Matrix1[0].length];
		for (int i = 0; i < Matrix1.length; i++) {
			for (int j = 0; j < Matrix1[0].length; j++) {
				ResMatrix[i][j] = Matrix1[i][j] + Matrix2[i][j];
			}
		}
		}else {
			throw new MatrixExeption("Matrixs can be only same size");
		}
		
		}catch(MatrixExeption ex) {
			System.out.println(ex.getMessage());
		}
		return ResMatrix;
	}
	
	
	public static int [][] MultMatrixOnNumber(int Matrix[][],int Num) {
		for (int i = 0; i < Matrix.length; i++) {
			for (int j = 0; j < Matrix[0].length; j++) {
				Matrix[i][j] *= Num;
			}
		}
	return Matrix;
	}
	
	public static int[][] MultMatrixs(int Matrix1[][], int Matrix2[][]) {
		int ResMatrix[][] = new int[Matrix1.length][Matrix2[0].length];
		try {
			if (Matrix1.length == Matrix2[0].length && Matrix2.length == Matrix1[0].length) {
				int res = 0;
				for (int i = 0; i < Matrix1.length; i++) {
					for (int k = 0; k < Matrix1.length; k++) {
						for (int j = 0; j < Matrix1[0].length; j++) {
							res = res + Matrix1[i][j] * Matrix2[j][k];
						}
						ResMatrix[i][k] = res;
						System.out.println(res);
						System.out.println();
						res = 0;
					}
				}
			} else {
				throw new MatrixExeption("Matrixs can be only correct size");
			}
		} catch (MatrixExeption ex) {
			System.out.println(ex.getMessage());
		}
		return ResMatrix;
	}

}
