package training;

public class Demo5 {

	public static void main(String[] args) {
		int prices[]= {7,6,4,3,1};
		int max=0;
        for(int i=1;i<prices.length-1;i++){
            if(prices[i]>prices[i+1]){
                max=prices[i];
                
            }else{
                max=prices[i+1];
            }
        }
        max=max-prices[1];
        if(max>prices[1]) {
        	System.out.println(max);
        }else {
        	System.out.println("0");
        }
        

	}

}
