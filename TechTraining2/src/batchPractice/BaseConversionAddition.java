package batchPractice;

public class BaseConversionAddition {
	public static int conversion(int num,int base) {
		
		int p=0;
		int res=0;
		while(num>0) {
			int digit=num%10;
			int val=(int) Math.pow(base,p);
			res+=(digit*val);
			p++;
			num/=10;
		}
		
		return res;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=123;
		int base1=6;
        int n2=234;
	    int base2=8;
		int t=conversion(n1,base1)+conversion(n2,base2);
		int min=6;
		int ans=0;
		int p=1;
		while(t>0){
            int digit=t%min;
            ans+=digit*p;
            p*=10;
            t/=min;
		}
		System.out.println(ans);

	}

}
