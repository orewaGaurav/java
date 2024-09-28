import java.util.*;
public class greatest {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        int a,b,c,g;
        Scanner i = new Scanner(System.in);
        System.out.println("Enter three num: ");
        a = i.nextInt();
        b = i.nextInt();
        c = i.nextInt();
        if(a>b&&a>c)
        g=a;
        else if(b>a&&b>c)
        g=b;
        else;
        g = c;
        System.out.println("The greatest is : "+g);
    }
}
