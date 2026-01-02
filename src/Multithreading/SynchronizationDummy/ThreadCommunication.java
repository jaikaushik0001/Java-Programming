package Multithreading.SynchronizationDummy;

class SharedResource{
    private int data;
    private boolean hasdata;

    public synchronized void produce(int data){
        while (hasdata){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        this.data = data;
        hasdata = true;
        System.out.println("Producer Produced: "+this.data);
        notify();
    }
    public synchronized int consume(){
        while (!hasdata){
            try{
                wait();
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }
        hasdata = false;
        System.out.println("Consumer Consumed: "+this.data);
        notify();
        return data;
    }
}

class Producer implements Runnable{
    private SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resource.produce(i);
        }
    }
}

class Consumer implements Runnable{
    private SharedResource resource;

    public Consumer (SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            resource.consume();
        }
    }
}


public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);

        Thread pro = new Thread(producer);
        Thread con = new Thread(consumer);

        pro.start();
        con.start();
    }
}
