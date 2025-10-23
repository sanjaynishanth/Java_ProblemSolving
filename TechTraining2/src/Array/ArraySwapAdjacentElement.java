package Array;

public class ArraySwapAdjacentElement {

	public static void main(String[] args) {
		int arr[]= {10,20,30};
		int n=arr.length;
		if(n%2==0) {
			for(int i=0;i<arr.length-1;i+=2) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}else {
			for(int i=0;i<arr.length-1;i+=2) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
				
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
