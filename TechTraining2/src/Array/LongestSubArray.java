/*Given an array arrll and an integer k, Find the length of the longest subarray in which the number of elements greater than
k is more than the number of elements less than or equal to k.

Examples:
Input: arr[ ]= [1, 2, 3, 4, 1], k = 2
Output: 3
Explanation:
The subarray [2, 3, 4] or [3, 4, 1] satisfy the given condition, and there is no subarray of length 4 or 5 which will hold the given
condition, so the answer is 3.

*/
package Array;
public class LongestSubArray {

	public static void main(String[] args) {
        int arr[]= {1,2,3,4,1};
        int k=2;
        int maxl=0;
        
        int len=0;
        for(int i=0;i<arr.length;i++) {
        	int countb=0;
	        int countl=0;
        	for(int j=i;j<arr.length;j++) {
        		
        		if(arr[j]>k) {
        			countb++;
        		}else {
        			countl++;
        		}
        		if(countb>countl) {
        			maxl=Math.max(maxl,j-i+1);
        		}
        	}
        	
        }
        System.out.print(maxl);
    }

}
