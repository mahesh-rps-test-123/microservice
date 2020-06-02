package com.cp.beans;

public class SadilPoint {
	
	public static boolean findSadlePoint(int mat[][],int n) {
		
		for(int i=0;i<n;i++) {
			
			int min_row=mat[i][0],col_index=0;
			for(int j=1;j<n;j++) {
				if(min_row>mat[i][j]) {
					min_row=mat[i][j];
					col_index=j;
				}
			}
			
			int k;
			for(k=0;k<n;k++) {
				if(min_row<mat[k][col_index])
					break;
			}
			if(k==n) {
				System.out.println("this is sadle point:"+min_row);
				return true;
			}
			
		}
		
		
		
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][]= {{1,2,3,4},
		              {5,6,7,8},
		              {9,10,11,12},
		              {13,14,15,16}};
		int n=4;
		if(findSadlePoint(mat,n)==false) {
			System.out.println("No sadle Point");
		}
		

	}

}
