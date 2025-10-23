package Array;

import java.util.Scanner;

public class MatrixMultiplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m1=sc.nextInt();
		int n1=sc.nextInt();
		int arr1[][]=new int[m1][n1];
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		int m2=sc.nextInt();
		int n2=sc.nextInt();
		int arr2[][]=new int[m2][n2];
		for(int i=0;i<m2;i++) {
			for(int j=0;j<n2;j++) {
				arr2[i][j]=sc.nextInt();
			}
		}
		
		if(n1!=m2) {
			System.out.print("does not perform matrix multiplication");
			return;
		}
		
		int res[][]=new int[m1][n2];

		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				res[i][j]=0;
				for(int k=0;k<n1;k++) {
					res[i][j]+=arr1[i][k]*arr2[k][j];
				}	
			}
		}
		
		for(int i=0;i<m1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
