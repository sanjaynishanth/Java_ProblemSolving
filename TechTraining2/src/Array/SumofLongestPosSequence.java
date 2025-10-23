package Array;

public class SumofLongestPosSequence {

	public static void main(String[] args) {
		int arr[]= {1,2,-5,-6,5,9,-8,-2,-7,-8};
	
		int maxlen=0;
		int maxsum=0;
		
		int currlen=0;
		int currsum=0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				currlen++;
				currsum+=arr[i];
				
			}else {
				if(currlen>maxlen) {
					maxlen=currlen;
					maxsum=currsum;
						
				}
				currlen=0;
				currsum=0;
			}
			
		}
		
		if(currlen>maxlen) {
			maxsum=currsum;
		}
		System.out.print(maxsum);

	}

}
