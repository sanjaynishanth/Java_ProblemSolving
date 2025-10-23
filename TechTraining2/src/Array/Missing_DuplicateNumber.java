package Array;

public class Missing_DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 3, 3, 4, 5};
		int n=arr[arr.length-1];
		int total=(n*(n+1))/2;
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			
		}
		System.out.print(sum);

	}

}
