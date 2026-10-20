package mutiThreading.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenOddPrint {
    private static int MAX = 25;
    private static int number = 1;
    public static void main(String args[]){
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable oddTask =()->{
            while(number <= MAX){
                synchronized (EvenOddPrint.class){
                    while(number <= MAX && number % 2 == 0){
                        try{
                            EvenOddPrint.class.wait();
                        }catch (Exception e){

                        }

                    }

                    if(number <= MAX){
                        System.out.println(Thread.currentThread().getName()+" -odd :"+number);
                        number++;
                        EvenOddPrint.class.notifyAll();
                    }

                }
            }

        };

        Runnable evenTask =()->{
            while(number <= MAX){
                synchronized (EvenOddPrint.class){
                    while(number <= MAX && number % 2 != 0){
                        try{
                            EvenOddPrint.class.wait();
                        }catch (Exception e){

                        }

                    }

                    if(number <= MAX){
                        System.out.println(Thread.currentThread().getName()+" -even :"+number);
                        number++;
                        EvenOddPrint.class.notifyAll();
                    }

                }
            }

        };

        executor.submit(oddTask);
        executor.submit(evenTask);

    }
}
