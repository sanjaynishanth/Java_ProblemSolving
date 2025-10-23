package arrays.Easy;

public class BuyAndSellStocksMultipleTransaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {100, 180, 260, 310, 40, 535, 695};
		int max=0;
		
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				max+=arr[i+1]-arr[i];
				System.out.println(max);
			}
			
			
		}
		System.out.print(max);

	}

}
