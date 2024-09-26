import java.util.*;
public class execHan {
    public static void division(int x,int y){
            try{
                int d = x/y;
                System.out.println("The division: "+d);
            }
            catch(ArithmeticException e){
                System.out.println("We can not divide any number by zero");
            }
    }
    public static void index(int n,int arr[]){
        try{
            int a =arr[n];
            System.out.println("value is: "+a);
        }
        catch(Exception e){
            System.out.println("Array is out of index!");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        division(x, y); 
        System.out.println("Enter the no. of element: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements: ");
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the index: ");
        int ind = sc.nextInt();

        index(ind, arr);
    }
    
}
