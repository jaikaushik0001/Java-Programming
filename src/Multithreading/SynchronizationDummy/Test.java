package Multithreading.SynchronizationDummy;

public class Test {
    static void test(){
        Counter c = new Counter();
        MyThread t1 = new MyThread(c);
        MyThread t2 = new MyThread(c);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
        }                  /* Sometimes this code gives any random number below 2000 as it's output
                              as due to lack of synchronization, t1 and t2 threads increment the value
                              at the same time which causes clash and increments the value only once.

                              To mitigate this problem "synchronized" keyword is used in the executing method */
        System.out.println(c.getCount());
    }
}
