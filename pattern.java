import java.util.*;
public class pattern {
    @SuppressWarnings({"resource","unused"})
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
        System.out.print("\n");
        for(int i =1;i<=n;i++){
            for(int j = n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        for(int i =5;i<=25;i=i+5){
            // int num = 25;
            for(int j = 5;j<=30-i;j=j+5){
                System.out.print(j+" ");
                // num = num-5;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i =5;i<=25;i=i+5){
            // int num = 25;
            for(int j = 25;j>=i;j=j-5){
                System.out.print(j+" ");
                // num = num-5;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=1;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i=1;i<=5;i++){
            for(int j = 5;j>=i;j--){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 1;i<=5;i++){
            for(int j = 97;j<97+i;j++){
                char ch = (char)j;
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for(int i = 1;i<=5;i++){
            for(int j = 65;j<65+i;j++){
                char ch = (char)j;
                System.out.print(ch+" ");
            }
            System.out.print("\n");
        }
        

    }
    
}
