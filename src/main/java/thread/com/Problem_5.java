package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Problem_5 {
    private static int number = 1;
    public synchronized void printFizz(){
//        for(int i =0; i<=8; i++){
            while(number <= 25 && number % 3 != 0){
                try{
                   wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            if(number % 5 == 0){
                System.out.println(Thread.currentThread().getName()+" FizzBuzz");
            }else{
                System.out.println(Thread.currentThread().getName()+" Fizz");
            }

            number++;
            notifyAll();
//        }

    }

    public synchronized void printBuzz(){
//        for(int i =0; i<=8; i++){
            while(number <= 25 && number % 5 != 0){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println(Thread.currentThread().getName()+" Buzz");
            number++;
            notifyAll();
//        }

    }

    public synchronized void printNumber(){
//        for(int i =0; i<=8; i++){
            while(number <= 25 && (number % 3 == 0 || number % 5 == 0)){
                try{
                    wait();
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }

            System.out.println(Thread.currentThread().getName()+" "+number);
            number++;
            notifyAll();
//        }
        
    }
    public static void main(String args[]){
        /*
        Task: Print numbers from 1 to 20 using three threads:
        - Thread A prints "Fizz" when a number is divisible by 3.
        - Thread B prints "Buzz" when a number is divisible by 5.
        - Thread C prints the number when it is divisible by neither 3 nor 5.
         */
        Problem_5 object = new Problem_5();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(() -> object.printFizz());
        executor.submit(() -> object.printBuzz());
        executor.submit(() -> object.printNumber());

        executor.shutdown();
    }
}
