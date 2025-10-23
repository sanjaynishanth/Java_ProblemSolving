package training;

public class RecursiveFibonnaci {
	public static void num(int n){
		if(n<1) {
			return  ;
		}
		
		System.out.println(n);
		num(n-1);
		
		
	}

	public static void main(String[] args) {
		int n1=10;
		num(n1);
		
		
	}

}

