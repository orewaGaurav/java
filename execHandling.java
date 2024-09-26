public class execHandling{
    public static void main(String[] args) {
        try{
            int arr[]= {2,3,4,5,6,7,8,9};
            System.out.println(arr[10]);
        
        }
        catch(Exception e){
        System.out.println("Array out of index");
        }
        System.out.println("we are out of first try");
        try{
        int z = 5;
        System.out.println(z/0);
        }
        catch(ArithmeticException e){
            System.out.println("Its a blunder to divide by zero");
        }
        System.out.println("we are out of second try");
        
    
    }
}
