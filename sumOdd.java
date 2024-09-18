import java.util.*;
public class sumOdd{
    public static void main(String args[]){
        int num1,num2;
        System.out.println("Enter the starting number and ending number: ");
        Scanner g = new Scanner(System.in);
        num1 = g.nextInt();
        num2 = g.nextInt();
        int sum=0;
        for(int i=num1;i<=num2;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of odd is: "+sum);
            



    
    }
}