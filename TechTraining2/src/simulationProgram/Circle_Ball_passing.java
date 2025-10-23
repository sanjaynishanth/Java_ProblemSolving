package simulationProgram;
import java.util.*;

public class Circle_Ball_passing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		
		String names[]=new String[n];
		for(int i=0;i<n;i++) {
			names[i]=sc.nextLine();
		}
		
		int pass=sc.nextInt();
		sc.nextLine();
		String start=sc.nextLine();
		String after=sc.nextLine();
		
		int sindex=-1; 
		int nexIndex=-1;
		for(int i=0;i<n;i++) {
			if(start.equals(names[i])) {
				sindex=i;
			}
			if(after.equals(names[i])) {
				nexIndex=i;
			}
		}
		String direction=" ";
		int finalind=0;
		if(names[(sindex+1)%n].equals(after)) {
			direction="ClockWise";
			finalind=(sindex+pass+1)%n;
			
		}else {
			direction="AntiClockWise";
			finalind=(sindex-pass+n*1000)%n;
		}
		
		System.out.println(direction+" "+names[finalind]);
		
	}

}
