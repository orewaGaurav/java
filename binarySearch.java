import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner  g=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = g.nextInt(); 
        int arr[] = new int[n];
        System.out.println("Enter the sorted array: ");
        int pos=0;
        for(int i = 0;i<n;i++){
            arr[i] = g.nextInt();
        }
        System.out.println("Enter the element to search: ");
        int num = g.nextInt();
        int j=n-1;
        int i=0;
        while(i<=j){
            int mid =(i+j)/2;
            if(arr[mid] == num){
                pos =mid+1;
                break;
            }
            else if(arr[mid]>num){
                j = mid-1;
            }
            else if(arr[mid]<num){
                i = mid+1;
                
            }
        }
        System.out.println("The position is: "+pos);

    }
}
