package javafundamentals.flowcontrol;
import java.util.*;


public class Checklstdigitsame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		n1=n1%10;
		n2=n2%10;
		if(n1==n2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		

	}

}

