package DSA;
import java.util.*;
import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {1,34,56,76,59,34,89,57};
		Arrays.sort(arr);
		int n=89;
		int mid=arr.length/2;
		if(n<arr[mid-1]) {
			while(n<=mid) {
				if(mid==n) {
					System.out.println();
				}
			}
			
		}else {
			for(int i=mid;i<arr.length;i++) {
				if(arr[i]==n) {
					System.out.println("find");
					
				}
			}
		}

	}

}
