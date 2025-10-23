package Array;

public class TrappingRainWater {

	public static void main(String[] args) {
		
		int arr[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		int left=0;
		int leftmax=0;
		int right=arr.length-1;
		int rightmax=0;
		
		int trapp=0;
		
		while(left<=right) {
			if(arr[left]<=arr[right]) {
				if(arr[left]>leftmax) {
					leftmax=arr[left];
				}else {
					trapp+=leftmax-arr[left];
				}
				left++;
			}else {
				if(arr[right]>rightmax) {
					rightmax=arr[right];
				}else {
					trapp+=rightmax-arr[right];
				}
				right--;
			}
		}
		System.out.println(trapp);
		

	}

}
