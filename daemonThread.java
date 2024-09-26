// public class daemonThread extends Thread{  
//     public void run(){  
//      if(Thread.currentThread().isDaemon()){//checking for daemon thread  
//       System.out.println("daemon thread work");  
//      }  
//      else{  
//      System.out.println("user thread work");  
//     }  
//     }  
//     public static void main(String[] args){  
//     daemonThread t1 = new daemonThread();
//     daemonThread t2 = new daemonThread();
//     daemonThread t3 = new daemonThread();


     
//      t1.setDaemon(true);//now t1 is daemon thread  
//      t2.setDaemon(false);
//     //  t3.setDaemon(true);
       
//      t1.start();//starting threads  
//      t2.start();  
//      t3.start();  
//     }  
//    }  

public class daemonThread extends Thread{
    @SuppressWarnings("resource")
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("its a daemon work");
        }
        else
        System.out.println("its a thread work");
    }
    public static void main(String args[]){
       daemonThread t1 = new daemonThread();
       daemonThread t2 = new daemonThread();
       daemonThread t3 = new daemonThread();

       t1.setDaemon(true);

       t1.start();//this will call run we can use t1.run instead;
       t2.start();
       t3.start();


    }
}