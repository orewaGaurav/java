import java.util.*;
public class array {
    public static void main(String args[]){
        System.out.print("Enter the number of elements: ");
        Scanner g = new Scanner(System.in);
        int n = g.nextInt();
        int arr[];
        arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = g.nextInt();
            // arr[i]=n1;
        }
        System.out.print("The array is: ");
        for(int i=0;i<n;i++){
            if(i<n-1)
            System.out.print(arr[i]+",");
            else
            System.out.print(arr[i]+"\n");
        }
    }
    
}
