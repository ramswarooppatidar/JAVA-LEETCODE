package thread.com;

public class Foo {
    private boolean firstDone = false;
    private boolean secondDone = false;
    public Foo() {

    }

    public synchronized void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        firstDone = true;  //add
        notifyAll();   //add
    }

    public synchronized void second(Runnable printSecond) throws InterruptedException {
        while(!firstDone){      //add
            wait();
        }
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        secondDone = true;   //add
        notifyAll();    //add
    }

    public synchronized void third(Runnable printThird) throws InterruptedException {
        while(!secondDone){            //add
            wait();
        }
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
