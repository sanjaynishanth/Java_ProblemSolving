package DSA;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {1,2,3,40,8,7,6,5};
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i=1;i<arr.length;i++) {
				if(arr[i]<arr[i-1]) {
					int temp=arr[i];
					arr[i]=arr[i-1];
					arr[i-1]=temp;
					flag=true;
				}
			}
		}
		for(int n:arr) {
			System.out.print(n+" ");
		}

	}

}

