package Array;

import java.util.Scanner;

public class Arr2dadd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//input for row and column for first array
		int r=sc.nextInt();
		int c=sc.nextInt();
		int arr[][]=new int[r][c];
		//entering values in 2d array1
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//input for row and column for first array
		int r1=sc.nextInt();
		int c1=sc.nextInt();
		int arr1[][]=new int[r1][c1];
		//entering values in 2d array2
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		//adding both array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr[i][j]+arr1[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
