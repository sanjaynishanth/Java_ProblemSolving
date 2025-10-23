package training;

public class IntToBinary {

	public static void main(String[] args) {
		String number="2080-02-29";
		String [] sep=number.split("-");
		String y=sep[0];
		String m=sep[1];
		String d=sep[2];
		
		 String binaryYear = Integer.toBinaryString(Integer.parseInt(y));
	     String binaryMonth = Integer.toBinaryString(Integer.parseInt(m));
	     String binaryDay = Integer.toBinaryString(Integer.parseInt(d));
	     
	     
	     String binaryDate = binaryYear + "-" + binaryMonth + "-" + binaryDay;
	     System.out.println(binaryDate);
	}

}

