// import java.util.*;
class thread1 extends Thread {
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(2000);
                
            }
            catch(Exception e){
                System.out.println(e);
                
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        thread1 t1 = new thread1();
        thread1 t2 = new thread1();
        System.out.println("\nResult will be display after 5 sec: please WAIT");
        t1.start();
        t2.start();
        System.out.println("Gaurav");
        // t1.run();
    }
}
