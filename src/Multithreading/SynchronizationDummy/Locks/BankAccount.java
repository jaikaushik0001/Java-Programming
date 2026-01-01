package Multithreading.SynchronizationDummy.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance = 100;
    private final Lock lock = new ReentrantLock();

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName()+" is attempting withdraw "+balance);
        try{
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName() + " is proceeding with the withdrawal...");
                        Thread.sleep(1000);
                        balance = balance - amount;
                        System.out.println("Completed Withdrawal, remaining balance is: "+balance);
                    }
                    catch (Exception e){
                        Thread.currentThread().interrupt();
                    }
                }
                else{
                    System.out.println(Thread.currentThread().getName()+" don't have sufficient balance");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" unable to acquire Lock, will try later...");
            }
        }
        catch  (Exception e){
            Thread.currentThread().interrupt();
        }
    }
}
