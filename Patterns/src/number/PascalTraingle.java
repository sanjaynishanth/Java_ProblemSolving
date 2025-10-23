package number;
import java.util.*;
public class PascalTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			int num=1;
			for(int k=0;k<i;k++) {
				System.out.print(num+" ");
				num=num*(i-k-1)/(k+1);
			}
			System.out.println();
		}

	}

}
