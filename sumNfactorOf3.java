import java.util.*;
public class sumNfactorOf3 {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        int sum=0;
        for(int i=3;i<=num*3;i=i+3){
            sum +=i;
            
        }
        System.out.println("sum of first n factor of 3 is "+sum);
    }
    
    
}
