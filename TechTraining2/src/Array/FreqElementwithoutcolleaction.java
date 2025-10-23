package Array;

import java.util.Arrays;

public class FreqElementwithoutcolleaction {

	public static void main(String[] args) {
		int arr[]= {1,2,2,4,5,5};
		Arrays.sort(arr);
		boolean freq[]=new boolean[1000];
		for(int i=0;i<arr.length;i++) {
			int count=0;
			if(!freq[arr[i]]) {
				for(int j=i;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
			}
			if(!freq[arr[i]]) {
				System.out.println(arr[i]+" "+count);				
			}
			freq[arr[i]]=true;
		}

	}

}
