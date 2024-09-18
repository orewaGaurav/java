import java.util.*;
public class factorial {
    public  void fact(int x){
        int f=1;
        for(int i=1;i<=x;i++){
            f= f*i;
        }
        System.out.println(f);
    }
    public static void main(String args[]){
        int x;
        System.out.println("Enter the number: ");
        Scanner j= new Scanner(System.in);
        x= j.nextInt();
        factorial g = new factorial();
        g.fact(x);

    }
}

