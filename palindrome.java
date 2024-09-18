import java.util.*;
public class palindrome {
    public void isPalindrome(int num){//agar es me static lg jayega to normal function jaisa kaam karega
        int a = num,r=0,d;
        while(num!=0){
            d = num%10;
            r=r*10+d;
            num= num/10;
        }
        if(a==r)
        System.out.println("yes its a palindrome");
        else
        System.out.println("Not a palindrome!");
    }
    public static void main(String args[]){
        int num;
        System.out.println("Enter the number: ");
        Scanner i = new Scanner(System.in);
        num = i.nextInt();
        palindrome p = new palindrome();//method ko object se call karenge
        p.isPalindrome(num);
        // isPalindrome(num); agar static lga hota to ye direct kaam kr deta
       
    }

    
    
}
