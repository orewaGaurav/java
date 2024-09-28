import java.util.*;
public class balanceCheck {
    public static void balance(double x){
        if(x>1000){
        System.out.println("Balance is sufficient");
        }
        else
        System.out.println("Balance is low");

    }
    public static void main(String args[]){
        double x;
        System.out.println("Enter the balance: ");
        Scanner i = new Scanner(System.in);
        x = i.nextDouble();
        balance(x);
        i.close();
    }
}
