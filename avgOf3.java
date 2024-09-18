// import java.util.*;
public class avgOf3 {
    public static void main(String args[]){
        double t =0.0,av;
        for(int i=1;i<args.length;i++)
        t+=Double.parseDouble(args[i]);
        System.out.println("Name is "+args[0]);
        System.out.println("Total Marks is "+t);
        av = t/3;
        System.out.println("Average is "+av);

    }
    
}
