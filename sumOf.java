import java.util.*;
public class sumOf {
    public static void main(String args[]){
        int n;
        System.out.println("Enter num: ");
        Scanner i = new Scanner(System.in);
        n = i.nextInt();
        int s=0;
        for(int j =1;j<=n;j++){
            s+=j;
        }
        System.out.println("sum is "+s);
    }
    
}
