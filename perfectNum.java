import java.util.*;
public class perfectNum {
    public static void main(String args[]){
        System.out.print("Enter the num: ");
        Scanner g = new Scanner(System.in);
        int num = g.nextInt();
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}