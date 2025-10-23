package number;
import java.util.*;
public class DecreasingNumber {
	public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        
        //Method1
        System.out.println("Method 1");

        for(int i=n;i>=1;i--){

            for(int j=n;j>i;j--){
                System.out.print(j);
               
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print(i);
            }

            
            for(int j=i+1; j<=n;j++) {
            	System.out.print(j);
            }
            
            System.out.println();
        }
        for(int i=2;i<=n;i++){

        	for(int j=n;j>i;j--){
        		System.out.print(j);
        		
        	}
        	for(int j=1;j<=i*2-1;j++){
        		System.out.print(i);
        	}

        	
        	for(int j=i+1; j<=n;j++) {
        		System.out.print(j);
        	}
        	
        	System.out.println();
        }
        
        System.out.println();
        
      //Method2
        System.out.println("Method 2");
        int size=n*2-1;
        for(int i=0;i<size;i++) {
        	for(int j=0;j<size;j++) {
        		int min=Math.min(Math.min(i, j), Math.min(size-1-i, size-1-j));
        		System.out.print(n-min);
        	}
        	System.out.println();
        }
	}

}
