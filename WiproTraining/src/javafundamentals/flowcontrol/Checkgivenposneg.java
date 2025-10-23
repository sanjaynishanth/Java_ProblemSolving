package javafundamentals.flowcontrol;
import java.util.*;
public class Checkgivenposneg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<=0) {
			System.out.println("Negative");
		}else if(n==0) {
			System.out.println("Zero");
		}else {
			System.out.println("positive");
		}

	}

}
