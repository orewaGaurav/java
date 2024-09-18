import java.util.*;
public class sumofDigit {
    public static void main(String args[]){
        System.out.print("Enter the num: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        int sum =0,d;
        while(num>0){
            d = num%10;
            sum+=d;
            num= num/10;
        }
        System.out.println("sum of digit is "+sum);

    }
}
