import java.util.*;
public class switch1 {
    public static void main(String args[]){
        System.out.print("Enter the number of day: ");
        Scanner i= new Scanner(System.in);
        int day = i.nextInt();
        switch(day){
            case 1:
            System.out.println("Monday 🥲");
            System.out.println("very hectic day");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("SUNDAY 😁");
            break;
            default:
            System.out.println("U R GOAT 🐐");
        }
    }
}
