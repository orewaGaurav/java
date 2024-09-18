import java.util.*;
public class sumEven {
    public static void main(String args[]){
        int num;
        System.out.println("Enter the number: ");
        Scanner g = new Scanner(System.in);
        num = g.nextInt();
        int sum =0;
        for(int i=2;i<=num;i=i+2){
            sum = sum+i;
        }
        System.out.println("sum of even number is: "+sum);

    }
}
