package Array;

public class SortingKdivisibleInDecreasing {

	public static void main(String[] args) {
		int arr[]= {10,5,8,2,15};
		int k=5;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]%k==0) {
				
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]%k==0) {
						if(arr[i]< arr[j]) {
							int temp=arr[i];
							arr[i]=arr[j];
							arr[j]=temp;
							
						}
					}
					
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	
	    	
}

}
