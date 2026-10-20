package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Printer2{
    private static int number = 1;
    public synchronized void print_1(){
        for(int i = 1; i<=5; i++){
            while(number % 3 == 2 || number % 3 == 0){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }

            }
            System.out.println(Thread.currentThread().getName()+" :"+number);
            number++;
            notifyAll();
        }
    }

    public synchronized void print_2(){
        for(int i = 1; i<=5; i++){
            while(number % 3 == 1 || number % 3 == 0){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }

            }
            System.out.println(Thread.currentThread().getName()+" :"+number);
            number++;
            notifyAll();
        }
    }

    public synchronized void print_3(){
        for(int i = 1; i<=5; i++){
            while(number % 3 == 1 || number % 3 == 2){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                    return;
                }

            }
            System.out.println(Thread.currentThread().getName()+" :"+number);
            number++;
            notifyAll();
        }
    }
}
public class Problem_3 {
    public static void main(String args[]){
        Printer2 print_2 = new Printer2();
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.submit(() -> print_2.print_1());
        executor.submit(() -> print_2.print_2());
        executor.submit(() -> print_2.print_3());

        executor.shutdown();
    }
}
