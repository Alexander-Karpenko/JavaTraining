package com.company.OOP;

public class MatrixRun extends MatrixMetods {

	public static void main(String[] args) throws MatrixExeption {
		int Matrix0[][] = { { 1, 1, 0}, { 1, 1, 1 } };
		int Matrix1[][] = { { 0, 1 }, { 0, 1 }, { 1, 1 } };
		int Res[][] = null;
		outMatrix(Matrix0);
		outMatrix(Matrix1);
		Res = MultMatrixs(Matrix0,Matrix1);
		outMatrix(Res);
		
		
	}

}
