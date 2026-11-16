package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer{
    private static boolean print = true;
    public synchronized void printA(){
        for(int i = 0; i < 5; i++){
            while(!print){
                try{
                    wait();
                }catch(InterruptedException e){

                }
            }

            System.out.print("A");
            print = false;
            notifyAll();
        }
    }

    public synchronized void printB(){
        for(int i = 0; i < 5; i++){
            while(print){
                try{
                    wait();
                }catch(InterruptedException e){

                }
            }

//            System.out.println(Thread.currentThread().getName()+" : B");
            System.out.print("B");
            print = true;
            notifyAll();
        }
    }

    Runnable printRunA = () -> {
        for(int i =0; i<5; i++){
            synchronized (this){
                while(!print){
                    try{
                        wait();
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.print("A");
                print = false;
                notifyAll();
            }

        }
    };

    Runnable printRunB = () -> {
        for(int i =0; i<5; i++){
            synchronized (this){
                while(print){
                    try{
                        wait();
                    }catch(InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                System.out.print("B");
                print = true;
                notifyAll();
            }

        }
    };
}
public class Problem_2 {
    public static void main(String args[]){
        Printer printer = new Printer();
        ExecutorService executort = Executors.newFixedThreadPool(2);

//        executort.submit(() -> printer.printA());
//        executort.submit(() -> printer.printB());
//
//        executort.shutdown();
        System.out.println("---------------------------------------------");
        executort.submit(printer.printRunA);
        executort.submit(printer.printRunB);
        executort.shutdown();
    }
}
