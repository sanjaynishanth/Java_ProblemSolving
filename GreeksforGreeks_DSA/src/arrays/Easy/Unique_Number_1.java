package arrays.Easy;

public class Unique_Number_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2, 3, 5, 4, 5, 3, 4};
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					
				}
				
			}
			if(count==0) {
				System.out.print(arr[i]);
			}
		}
		

	}

}
