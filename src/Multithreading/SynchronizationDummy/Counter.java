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