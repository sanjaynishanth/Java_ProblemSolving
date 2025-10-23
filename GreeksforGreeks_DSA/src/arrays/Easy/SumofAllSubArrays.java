package arrays.Easy;

public class SumofAllSubArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1, 4, 5, 3, 2};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			int temp=0;
			for(int j=i;j<arr.length;j++) {
				temp+=arr[j];
				max+=temp;
				
			}
			
		}
		System.out.println(max);

	}

}
