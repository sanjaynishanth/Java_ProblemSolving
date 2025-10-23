package batchPractice;

public class Circular_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1000;
		String s=Integer.toString(n);
		int len=s.length();
		boolean result=true;
		
		//Method 1 without using string
		int count=0;
		while(count<len) {
			int check=0;
			int q=n/(int) Math.pow(10,len-1);
			int rem=n% (int) Math.pow(10, len-1);
			
			check=rem*10+q;
			
			boolean flag=true;
			for(int j=2;j<check;j++) {
				if(check % j==0) {
					flag=false;
					break;
				}
			}

			
			if(!flag) {
				result=false;
				break;
			}
			n=check;
			count++;
			
		}

//     Method 2 using string
		
//		for(int i=0;i<len;i++) {
//			
//			int digit=n%10;
//			int rem=n/10;
//			
//			String rot=Integer.toString(digit)+Integer.toString(rem);
//			
//			int check=Integer.parseInt(rot);
//
//			boolean flag=true;
//			for(int j=2;j<check;j++) {
//				if(check % j==0) {
//					flag=false;
//					break;
//				}
//			}
//
//			
//			if(!flag) {
//				result=false;
//				break;
//			}
//			
//			n=check;
//		}
//		
		if(result) {
			System.out.print("Circular Prime");
		}else {
			System.out.print("Not circular");
		}

	}

}
