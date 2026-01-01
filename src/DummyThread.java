public class DummyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Dummy Thread is running");
    }
    DummyThread(String name){
        super(name);
    }
    static void dummyThread(){
        DummyThread t = new DummyThread("Dummy Thread");
        System.out.println("Thread Name: "+t.getName());
        System.out.println("Thread State: "+t.getState());
        t.start();
        System.out.println("Thread State: "+t.getState());
        t.run();
        System.out.println("Thread State: "+t.getState());
    }
}
