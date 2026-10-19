package InterviewQuestion;

public class DeadLock {

    private static final Object obj1 = new Object();
    private static final Object obj2 = new Object();

    public void method1() {
        synchronized (obj1) {

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            synchronized (obj2) {

            }
        }
    }

    public void method2() {
        synchronized (obj2) {

            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
            synchronized (obj1) {

            }
        }
    }

    public static void main(String[] args) {

        DeadLock deadLock = new DeadLock();
        // Thread t1=new Thread(deadLock::method1);
        //Thread t1 = new Thread(() -> deadLock.method2());


        RunnaleThread runnaleThread = new RunnaleThread(deadLock);
        Thread t1 = new Thread(runnaleThread);


        Thread t2 = new Thread(() -> deadLock.method2());
        t1.start();
        t2.start();
    }
}

//Thread t2 = new Thread(new Runnable() {
//    @Override
//    public void run() {
//        deadLock.method2();
//    }
//});
