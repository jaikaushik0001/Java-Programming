package Multithreading.SynchronizationDummy;

public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }
}

// Instead of using the synchronized keyword in the method declaration, we can create synchronized block
// inside the method for a block of code which needs to be synchronized

// This part of the code is known as critical section, this is the part which is working as the shared
// common area during the execution of both the threads