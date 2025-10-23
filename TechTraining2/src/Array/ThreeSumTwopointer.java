package Array;
import java.util.*;
public class ThreeSumTwopointer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8,9};
		Arrays.sort(arr);
		int total=6;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			int left=i+1;
			int right=arr.length-1;
			while(left<right) {
				int sum=arr[i]+arr[left]+arr[right];
				if(sum==total) {
					flag=true;
					break;
				}else if(sum<total) {
					left++;
				}else {
					right--;
				}
			}
		}
		if(flag) {
			System.out.print("true");
		}else {
			System.out.print("fasle");
		}
	}
}

