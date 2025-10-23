package Array;

public class SlidingWindow {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		
		int k=3;
		
		for(int i=0;i<=arr.length-k;i++) {
			
			int minn=Integer.MAX_VALUE;
			int maxx=Integer.MIN_VALUE;
			for(int j=i;j<i+k;j++) {
				if(arr[j]<minn) {
					minn=arr[j];
				}
				if(arr[j]>maxx) {
					maxx=arr[j];
				}
//				System.out.print(arr[j]+" ");
				
			}
			
			System.out.println(minn+maxx);
//			System.out.println();
		}
		
	}

}
