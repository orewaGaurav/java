import java.util.*;
public class fibonacii {
    public static void main(String args[]){
        System.out.print("Enter the num: ");
        Scanner i  = new Scanner(System.in);
        int n,f1= 0,f2= 1,f;
        n = i.nextInt();
        for(int j=1;j<n-1;j++){
            f=f1+f2;
            System.out.print(f+" ");
            f1 = f2;
            f2 = f;

        }
        i.close();

    }
}

