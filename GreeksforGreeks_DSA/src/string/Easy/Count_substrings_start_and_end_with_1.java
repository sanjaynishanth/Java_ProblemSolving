package string.Easy;

public class Count_substrings_start_and_end_with_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="111";
		int count=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(s.charAt(i)=='1' && s.charAt(j)=='1') {
					count++;
				}	
			}
		}
		System.out.print(count);
		
		
//		using formula by only counting one
//		count*(count-1)/2;

	}

}
