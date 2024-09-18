import java.util.*;
public class primeNum {
    public static void main(String args[]){
        System.out.print("Enter the num to check: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        int count =0;
        for(int i =1;i<num;i++){
            if (num%i==0){
                count++;
            }
        }
        switch(count){
            case 1:
            System.out.println("Its a prime num");
            break;
            default:
            System.out.println("Not a prime num");
        }
        
    }
}
