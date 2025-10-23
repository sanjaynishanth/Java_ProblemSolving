package Array;

import java.util.Scanner;

public class Arr2d {

	public static void main(String[] args) {
		
		int arr[][]= {{0,2,6},{4,19,3},{1,4,8}};
		
		
		for(int row=0;row<arr.length;row++) {
			int rsum=0;
			int max=0;
			int min=Integer.MAX_VALUE;
			for(int c=0;c<arr[row].length;c++) {
				System.out.print(arr[row][c]+" ");
				rsum=rsum+arr[row][c];//sum of row
				if(max<arr[row][c]){
					max=arr[row][c];
				}//max element in row
				if(min>arr[row][c]){
					min=arr[row][c];
				}//min element in row
				
				
			}
			System.out.println("sum="+rsum+" Max="+max+" Min="+min);
			
			
		}
		
		System.out.println();
		//sum of column
		for(int i=0;i<3;i++) {
			int csum=0;
			int cmax=0;
			int cmin=Integer.MAX_VALUE;
			for(int j=0;j<3;j++) {
				//System.out.print(arr[j][i]+" ");
				csum=csum+arr[j][i];//sum of row
				if(cmax<arr[j][i]){
					cmax=arr[j][i];
				}
				if(cmin>arr[j][i]){
					cmin=arr[j][i];
				}
				
				
			}
			System.out.println("sum="+csum+" Max="+cmax+" Min="+cmin);
			
			
		}
		

	}

}
