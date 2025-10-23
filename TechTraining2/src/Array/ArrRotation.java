package Array;

import java.util.*;

public class ArrRotation {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int k = 2;
		int n = arr.length;

//		k = k % n;
//		System.out.print(k);
		System.out.println("Original array: " + Arrays.toString(arr));
		for (int i = 0; i < k; i++) {
			int last = arr[n - 1];
			for (int j = n - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
			System.out.println("Array after " + (i + 1) + " rotation: " + Arrays.toString(arr));
		}
		System.out.println("Final rotated array: " + Arrays.toString(arr));
	}

}
