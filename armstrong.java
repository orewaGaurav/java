import java.util.*;
public class armstrong {
    @SuppressWarnings({"resource","unused"})
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner g = new Scanner(System.in);
        String num = g.nextLine();
        int l = num.length();
        int num1 = Integer.parseInt(num);//convert string into int
        // int num1 = Integer.valueOf(num);//convert string into int
        double sum=0,d;
        double p;
        int num2 = num1;
        while(num1>0){
            d = num1%10;
            p = Math.pow(d,l);
            sum = sum+p;
            num1=num1/10;

        }
        if(num2==sum)
        System.out.println("Yes its a ARMSTRONG");
        else
        System.out.println("NOT a ARMSTRONG");
    
        
    }
}
