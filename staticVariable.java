//Java Program to demonstrate the use of static variable  
class Student{  
    int rollno;//instance variable  
    String name;  
    static String college ="NIET";//static variable  
    //constructor  
    Student(int r, String n){  
    rollno = r;  
    name = n;  
    }  
    //method to display the values  
    void display (){System.out.println(rollno+" "+name+" "+college);}  
 }  
 //Test class to show the values of objects  
 public class staticVariable{  
  public static void main(String args[]){  
  Student s1 = new Student(111,"Gaurav");  
  Student s2 = new Student(222,"Lavesh");  
  //we can change the college of all objects by the single line of code  
  //Student.college="BBDIT";  
  s1.display();  
  s2.display();  
  }  
 }  