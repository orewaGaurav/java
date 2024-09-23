import java.util.*;
public class overloading{
public void sum(int a,int b){
    int c = a+b;
    System.out.println("sum of int "+c);
}
public void sum(float f1,float f2){
    float f3 = f1+f2;
    System.out.println("sum of float "+f3);
}
public void sum(long l1,long l2){
    long l3= l1+l2;
    System.out.println("sum of long "+l3);
}
public static void main(String args[]){
    Scanner i = new Scanner(System.in);
    System.out.println("Enter the int1");
    int a = i.nextInt();
    System.out.println("Enter the int2");
    int b = i.nextInt();
    System.out.println("Enter the float1");
    float f1 = i.nextFloat();
    System.out.println("Enter the float2");
    float f2 = i.nextFloat();
    System.out.println("Enter the long1");
    long l1 = i.nextLong();
    System.out.println("Enter the long2");
    long l2 = i.nextLong();
    overloading s1 = new overloading();
    s1.sum(a,b);
    s1.sum(f1,f2);
    s1.sum(l1,l2);

    

}
}