package Multithreading.SynchronizationDummy;

class Pen{
    public synchronized void writeWithPenAndPaper (Paper paper){
        System.out.println(Thread.currentThread().getName()+" is using pen "+this+" and trying to use paper");
        paper.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using pen"+this);
    }
}

class Paper{
    public synchronized void writeWithPaperAndPen (Pen pen){
        System.out.println(Thread.currentThread().getName()+" is usng paper "+this+" and trying o use pen");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using paper"+this);
    }
}

class Task1 implements Runnable{
    Paper paper;
    Pen pen;
    public Task1(Paper paper, Pen pen){
        this.paper = paper;
        this.pen = pen;
    }
    @Override
    public void run() { /* **Most Imp** : If we introduce a synchronized block and put
           pen.writeWithPenAndPaper(paper) in it then it will wait for Paper lock to be released.*/
        synchronized (paper){
            pen.writeWithPenAndPaper(paper); // Thread 1 Locks Pen and tries to lock Paper
        }
    }
}

class Task2 implements Runnable{
    Pen pen;
    Paper paper;
    public Task2(Paper pap, Pen pen){
        this.paper = pap;
        this.pen = pen;
    }
    @Override
    public void run(){
        paper.writeWithPaperAndPen(pen); // Thread 2 Locks Paper and tries to  \\lock Pen
    }
}

public class DeadLockExample {
    public static void main(String[] args) {

        Paper paper = new Paper(); // One resource of paper
        Pen pen = new Pen();       // One resource of pen

        Task1 task1 = new Task1(paper,pen);
        Task2 task2 = new Task2(paper,pen);

        Thread thread1 = new Thread(task1);  // Initiated the threads for Task1 and Task2
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}
