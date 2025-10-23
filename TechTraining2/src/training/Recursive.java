package training;

public class Recursive {
	public static int factors(int n,int i){
		
		if(i>n) { return 0; }
		 
		if(n%i==0) {
			return i+factors(n,i+1);
		}else {
			return factors(n,i+1);
		}
		
	}

	public static void main(String[] args) {
		int n1=10;
		
		int sum=factors(n1,1);
		System.out.println(sum);
		
	}

}

