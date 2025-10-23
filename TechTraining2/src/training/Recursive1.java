package training;

public class Recursive1 {
	public static void num(int n){
		if(n<=0) {
			return ;
		}
		num(n-1);
		System.out.println(n);
		
		
	}
	public static void num1(int n){
		if(n<1) {
			return ;
		}
		
		System.out.println(n);
		num(n-1);
		
		
	}

	public static void main(String[] args) {
		int n1=10;
		num(n1);
		num1(n1);
		
		
	}

}

