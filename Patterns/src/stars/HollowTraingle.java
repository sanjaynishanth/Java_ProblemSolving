package stars;

public class HollowTraingle {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<=2*(i-1);j++) {
				if(i==n||j==0||j==2*(i-1)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
//				System.out.print("*");
			}
			System.out.println();
		}

	}

}
