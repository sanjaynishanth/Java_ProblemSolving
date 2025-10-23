package techAlgorithms;

public class PrefixSum {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
    	int n=arr.length;
    	
    	int prefix[]=new int[n+1];
    	
    	for(int i=0;i<n;i++) {
    		prefix[i+1]=prefix[i]+arr[i];
    	}
    	
    	for(int i:prefix) {
    		System.out.print(i+" ");
    	}
	}
	
}
