import java.util.*;
public class insertArray {
    public static void main(String args[]){
        Scanner g =new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n =g.nextInt();
        int arr[] = new int[n];
        int k = 0;
        while(k<n){
            arr[k]=g.nextInt();
            k++;
        }
        for(int i =0;i<n;i++){
            if(i<n-1)
            System.out.print(arr[i]+",");
            else
            System.out.print(arr[i]);
        }
        System.out.print("\n");
        System.out.println("Enter the element to insert: ");
        int n1 = g.nextInt();
        System.out.println("enter the index: ");
        int index= g.nextInt();
    }
    
}
