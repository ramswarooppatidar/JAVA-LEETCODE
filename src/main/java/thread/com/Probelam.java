package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Probelam {
    private static int max = 25;
    private static int number = 1;
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable oddTask = () -> {
            while(number <= max){
                synchronized (Probelam.class){
                    while(number <= max && number % 2 == 0){
                        try {
                            Probelam.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                     if(number <= max){
                         System.out.println(Thread.currentThread().getName()+" -odd "+number);
                         number++;
                         Probelam.class.notifyAll();
                     }


                }
            }
        };


        Runnable evenTask = () -> {
            while(number <= max){
                synchronized (Probelam.class){
                    while(number <= max && number % 2 != 0){
                        try {
                            Probelam.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    if(number <= max){
                        System.out.println(Thread.currentThread().getName()+" -even "+number);
                        number++;
                        Probelam.class.notifyAll();
                    }


                }
            }
        };

        executor.submit(oddTask);
        executor.submit(evenTask);

        executor.shutdown();
    }
}
