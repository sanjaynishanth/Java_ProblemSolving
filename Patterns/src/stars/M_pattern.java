package stars;

public class M_pattern {

	public static void main(String[] args) {
		int n=7;
		int mid=0;
		if(n%2==0) {
			mid=n/2;
		}else {
			mid=n/2+1;
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || j==n ) {
					System.out.print("* ");
				}else if(((i==j ||i+j==n+1) && i<=mid) ||(mid==i && mid==j)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}

//(i+1==n-j+2 || i==j))||(mid==i && mid==j)

//(((i==j ||i+1==n-j+2) && i<mid) ||(mid==i && mid==j))
