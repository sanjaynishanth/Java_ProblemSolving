package Array;
import java.util.*;
public class Arraysum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int sumt=0;
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			sumt+=arr[i];
			if(arr[i]%2==0) {
				sum=sum+arr[i];
			}
		}
		System.out.println("total"+sumt);
		System.out.println("Even no."+sum);
		
	}

}
