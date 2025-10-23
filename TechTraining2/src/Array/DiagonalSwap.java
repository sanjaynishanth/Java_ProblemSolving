package Array;

public class DiagonalSwap {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		
		System.out.println("Before Diagonal interchange");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i][i];
			arr[i][i]=arr[i][n-i-1];
			arr[i][n-i-1]=temp;
			
		}
		System.out.println("After Diagonal interchange");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
