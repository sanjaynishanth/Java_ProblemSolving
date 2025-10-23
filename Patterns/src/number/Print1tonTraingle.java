package number;
import java.util.*;

public class Print1tonTraingle{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int res=0;
		
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				res++;
				System.out.print(res+" ");
				
			}
			System.out.println();
		}
		

	}

}
