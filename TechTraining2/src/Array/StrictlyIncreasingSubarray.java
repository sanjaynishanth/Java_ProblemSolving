/*Given an integer array arrll, the task is to count the number of subarrays in arr[l that are strictly increasing and have a size of at least
2. A subarray is a contiguous sequence of elements from arrll.
A subarray is strictly increasing if each element is greater than its previous element.

Examples:

Input: arrl = [1, 4, 5, 3, 7, 9]
Output: 6
Explanation: The strictly increasing subarrays are: [1, 4], [1, 4, 5], [4, 5], [3, 7], [3, 7, 9], [7, 9]*/


package Array;
import java.util.*;
public class StrictlyIncreasingSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2, 2, 2, 2};
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				boolean flag=true;
				
				for(int k=i;k<j;k++) {
					if(arr[k]>=arr[k+1]) {
						flag=false;
						break;
					}
				}
				
				int count=0;
				if(flag ) {
					for(int k=i;k<=j;k++) {
						count++;
//						System.out.print(arr[k]+" ");
					}
//					System.out.println();
					
				}
				if(count>1) {
					max++;
				}
				
			}
		}
		System.out.print(max);

	}

}
