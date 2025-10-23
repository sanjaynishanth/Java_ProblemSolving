package training;

import java.util.Scanner;

public class Loopsbasics {
	public static void main(String[] args) {
		int sum=0;
		int num=11;
		int count=0;
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				System.out.println(i);
				sum=sum+i;
				count++;
				
			}
			
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("not a prime");
		}
	}

}
