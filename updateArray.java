import java.util.*;
public class updateArray{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = g.nextInt();
        int arr[]=new int[n];
        int newArr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=g.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println("Enter the element to insert: ");
        int value = g.nextInt();
        System.out.println("enter the index: ");
        int index =g.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==index){
                for(int j =i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    


    }
}