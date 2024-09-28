import java.util.*;
public class assertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        assert (age >=18 && age<=60): "Not Valid candidate";
        System.out.println("age is "+age);
        sc.close();
    }
}
// to run it we hve to first enable assertion
//first compile it by javac fileName.java
// then java -ea fileName 
