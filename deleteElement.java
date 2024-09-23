import java.util.*;
public class deleteElement{
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner g = new Scanner(System.in);
        System.out.println("Enter the no. of elements: ");
        int n = g.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=g.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println(" ");
        System.out.println("Enter the element to delete: ");
        int value = g.nextInt();
        int flag=0;
        for(int i=0;i<n;i++){
            if(arr[i]==value)
            flag++;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==value){
                for(int j =i;j<n-1;j++){
                    arr[j]=arr[j+1];
                }
                n--;
            }
        }
        System.out.println(flag);
        if(flag!=0){
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
        }
        else
        System.out.println("No element found in array!");
    


    }
}