package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static int max = 20;
    private static int number = 1;
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable oddTask = () -> {
            while(number <= max){
                synchronized (Main.class){
                    while(number <= max && number % 2 == 0){
                        try{
                            Main.class.wait();
                        }catch(InterruptedException e){
                            return;
                        }

                    }
                    if(number <= max){
                        System.out.println(Thread.currentThread().getName()+" -odd :"+number);
                        number++;
                        Main.class.notifyAll();
                    }
                }
            }
        };

        Runnable evenTask = () -> {
            while(number <= max){
                synchronized (Main.class){
                    while(number <= max && number % 2 != 0){
                        try{
                            Main.class.wait();
                        }catch(InterruptedException e){
                            return;
                        }

                    }
                    if(number <= max){
                        System.out.println(Thread.currentThread().getName()+" -even :"+number);
                        number++;
                        Main.class.notifyAll();
                    }
                }
            }
        };

        executor.submit(oddTask);
        executor.submit(evenTask);
    }
}
