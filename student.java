import java.util.*;
class student1{
    int roll;
    String name;
    float marks1;
    float marks2;
    float marks3;
    public void enter(int roll,String name,float marks1,float marks2,float marks3){
        this.roll = roll;
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }
   
}
class newstudent extends student1{
    float total,avg;
    public void work(){
        total = marks1+marks2+marks3;
        avg = total/3; 
    }
    public void display(){
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
    }
}
public class student {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner i = new Scanner(System.in);
        System.out.println("roll: ");
        int roll = i.nextInt();
        System.out.println("name: ");
        String name = i.next();
        System.out.println("m1: ");
        float marks1 = i.nextFloat();
        System.out.println("m2: ");
        float marks2 = i.nextFloat();
        System.out.println("m3: ");
        float marks3 = i.nextFloat();
        newstudent n1 = new newstudent();
        n1.enter(roll,name,marks1,marks2,marks3);
        n1.work();
        n1.display();
        
    }
}
