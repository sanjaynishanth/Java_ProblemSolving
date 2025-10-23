package Array;

public class TransposeMatrix90 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int m=3;
		int n=3;
		int arr1[][]=new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				arr1[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<m;i++) {
			for(int j=n-1;j>=0;j--) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
