package Multithreading.SynchronizationDummy;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterantExample {
    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try{
            System.out.println("Outer Method");
            innerMethod();
        }
        finally{
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try{
            System.out.println("Inner Method");
            innerMethod();
        }
        finally{
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReenterantExample r = new ReenterantExample();
        r.outerMethod();
    }

}
