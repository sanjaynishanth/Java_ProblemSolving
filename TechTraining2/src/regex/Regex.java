package regex;
import java.util.*;
import java.util.regex.*;


public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String log = "User1 logged in at 10:45AM, User2 at 12:30PM";
//
//        Pattern p = Pattern.compile("[A-Za-z0-9]+\\s+logged in at\\s+[0-9:APM]+");
//        Matcher m = p.matcher(log);
//
//        while (m.find()) {
//            System.out.println("Match: " + m.group());
//        }
        
        String text = "Java is powerful and fun!";
        Pattern p = Pattern.compile("\\w+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
        
        String s = "My pin is 1234";
        System.out.println(s.replaceAll("M","a"));


	}

}
