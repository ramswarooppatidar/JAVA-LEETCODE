package aathread;

class myThread extends Thread{
    public void run(){
        for(int i =0; i<100; i++){
            System.out.println(i+" " + Thread.currentThread().getName()+"  : ");
        }
    }
}
public class MultiThreading {
    public static void main(String args[]){
        myThread t1 = new myThread();
        myThread t2 = new myThread();
        t1.start();
        t2.start();

        /*

         */
    }
}
