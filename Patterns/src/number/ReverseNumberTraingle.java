package number;

public class ReverseNumberTraingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}
			int val=i;
			for(int j=0;j<=n-i;j++) {
				System.out.print(val+" ");
				val++;
			}
			System.out.println();
		}

	}

}
