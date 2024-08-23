import java.util.*;
class pattern_10{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter line number : ");
        int n = sc.nextInt();
        for(int i=1,j=n*2;i<=n && j>0;i++,j=j-2){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=j-2;l>0;l--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n,j=0;i>=1 && j<=(n*2);i--,j=j+2){
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            for(int l=0;l<j;l++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }
}