import java.util.*;
public class countDigit {
    @SuppressWarnings({ "unused", "resource" })
    public static void main(String args[]){
        System.out.print("Enter the num: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        int d,digit=0;
        while(num>0){
            d=num%10;
            num=num/10;
            digit++;
        }
        System.out.println("Number of digit: "+digit);
    }
}
