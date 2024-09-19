import java.util.*;
public class pattern {
    public static void main(String args[]){
        System.out.print("Enter n: ");
        Scanner g = new Scanner(System.in);
        int n = g.nextInt();
        for(int i =0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }

    }
    
}
