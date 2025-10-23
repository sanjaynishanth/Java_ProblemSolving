package string;

public class Upperlowerstring {

	public static void main(String[] args) {
		String word="JA";
		char ch[] = word.toCharArray();
        boolean flag=true;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>97 && ch[i]<122){
                flag=false;
                break;

            }
        }
        if(flag){
            System.out.println("true");
        }
        else System.out.println("false");

	}

}


