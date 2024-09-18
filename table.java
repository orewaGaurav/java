import java.util.*;
public class table {
    public static void main(String args[]){
        System.out.print("Enter the number: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        for(int i= num;i<=num*10;i=i+num){
            System.out.println(i);
        }
    }
    
}
