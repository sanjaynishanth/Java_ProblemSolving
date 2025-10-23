package Array;

public class SaddlePoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int m=3;
		int n=3;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int min=Integer.MAX_VALUE;
			int col=0;
			int row=0;
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]<min) {
					min=arr[i][j];
					col=j;
				}
			}
			int max=0;
			for(int k=0;k<m;k++) {
				if(arr[k][col]>max) {
					max=arr[k][col];
					row=k;
				}
				
			}
			
			if(min==max) {
				System.out.print("Yes Saddle Point"+row+""+col);
				flag=true;
				break;
			}
		}
		
		if(!flag) {
			System.out.print("No Saddle Point");
		}

	}

}
