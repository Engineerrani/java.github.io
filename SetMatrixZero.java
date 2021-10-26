package javaAssignment;

import java.util.Arrays;

public class SetMatrixZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1,1,1,0},{1,0,1,5},{1,5,1,1}};
		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];
		Arrays.fill(row, -1);
		Arrays.fill(col, -1);
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				if(matrix[i][j]==0) {
					row[i]=0;
					col[j]=0;
				}
			}
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				if(row[i]==0 || col[j]==0) {
					matrix[i][j]=0;
				}
			}
		}
		for(int i=0; i<matrix.length;i++) {
			for(int j=0; j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}


	}


