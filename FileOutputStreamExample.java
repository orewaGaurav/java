import java.io.*;
public class FileOutputStreamExample {
    public static void main(String args[]){
        try{
            //FileOutputStream is a class
            FileOutputStream fout = new FileOutputStream("/Users/gauravkumar/Terjava/b.txt");
            //this will create a file at given address
            fout.write(65);
            fout.close();
            System.out.println("Sucess...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

