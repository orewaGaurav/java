import java.util.*;
public class string {
    public static void main(String[] args) {
        String s = "GAURAV ";
        char ch[] = {'K','U','M','A','R'}; 
        String s1 =new String(ch);
        System.out.println(s);
        System.out.println(s1);

        System.out.println(s.startsWith("G"));
        System.out.println(s.endsWith("V"));
        System.out.println(s.trim());//removes the leading and trailing spaces
        System.out.println(s.length());
        System.out.println(s.charAt(1));
        System.out.println(s.replace("G","g"));
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
        int num = 123;
        // String strNum = String.valueOf(num); 
        System.out.println(String.valueOf(num));

        //string toUpperCase()
        //string toLowerCase()
        //String trim() method
        //String startsWith() and endsWith() method    
        //stringCharAt(index) method
        //string length() method
        //string valueOf() method
        //string replace() method
    }
    
}
