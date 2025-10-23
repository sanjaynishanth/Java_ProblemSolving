package simulationProgram;

import java.util.*;

public class CounterGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			long n=sc.nextLong();
			
			boolean turn=true;
			if(n==1) {
				System.out.print("Richard");
			}
			while(n>1) {
				if((n&(n-1))==0) {
					n=n/2;
				}else {
					long power=Long.highestOneBit(n);
					n=n-power;
				}
				
				turn=!turn;
			}
			if(turn) {
				System.out.print("Richard");
			}else {
				System.out.print("Louise");
			}
			
			
		}

	}

}
