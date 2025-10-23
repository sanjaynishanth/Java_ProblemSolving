package Array;
import java.util.*;
public class Arrmin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min=Integer.MAX_VALUE;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
		System.out.println(min);
		
	}

}
