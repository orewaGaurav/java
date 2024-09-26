class Thread_runnable implements Runnable{  //another method to create thread using implements
    public void run(){  
    System.out.println("thread is running...");  
    }  
      
    public static void main(String args[]){  
    Thread_runnable m1=new Thread_runnable();  
    Thread t1 =new Thread(m1);   // Using the Thread
    t1.start();  

    Thread_runnable m2 = new Thread_runnable();
    Thread t2 = new Thread(m2);
    t2.start();

    
    }  

} 

