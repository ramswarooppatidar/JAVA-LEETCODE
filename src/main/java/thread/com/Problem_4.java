package thread.com;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class SharedBuffer{
    private Integer data = null;
    public synchronized void producer(int value){
        while(data != null){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        System.out.println("produce data :"+ value);
        notifyAll();
    }

    public synchronized void consumer(){
        while(data == null){
            try{
                wait();
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }

        }
        int value = data;

        System.out.println("consume data :"+ value);
        data = null;
        notifyAll();
    }
}
public class Problem_4 {
    public static void main(String args[]){
      SharedBuffer buffer = new SharedBuffer();
        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.submit(() -> {
            for(int i =1; i<=5; i++){
                buffer.producer(i);
            }
        });

        executor.submit(() -> {
            for(int i =1; i<=5; i++){
                buffer.consumer();
            }
        });
    }
}
