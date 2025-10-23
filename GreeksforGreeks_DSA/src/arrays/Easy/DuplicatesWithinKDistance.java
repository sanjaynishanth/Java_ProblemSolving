package arrays.Easy;
import java.util.*;

public class DuplicatesWithinKDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int arr[]= {1, 2, 3,4,5};
		int k=3;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					int val=Math.abs(i-j);
					if(val<=k) {
						flag=true;
						break;
					}
				}
			}
			break;
		}
		
		if(flag) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}

	}

}
