package DSA;

public class LinearSearch {
	int linear(int[]arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i;
				
			}
			
		}
		return -1;
	}

	public static void main(String[] args) {
		LinearSearch sc=new LinearSearch();
		int arr[]= {1,5,8,4,6};
		int n=8;
		int ind=sc.linear(arr, n);
		if(ind>=0) {
			System.out.println(n+" finded in "+ind);
		}else {
			System.out.println("nothing");
		}

	}

}


