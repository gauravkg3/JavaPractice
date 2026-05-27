package InterviewQuestion;


import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PreventDeadLock {


    Lock lock1 = new ReentrantLock();
    Lock lock2 = new ReentrantLock();


    public void method1() throws InterruptedException {

        try {
            if (lock1.tryLock(10, TimeUnit.SECONDS)) {

                if (lock2.tryLock(10, TimeUnit.SECONDS))
                    try {
                        Thread.sleep(100);
                    } finally {
                        lock2.unlock();
                    }
            }
        } finally {
            lock1.unlock();
        }


    }

    public void method2() throws InterruptedException {
        try {
            if (lock2.tryLock(10, TimeUnit.SECONDS)) {

                if (lock1.tryLock(10, TimeUnit.SECONDS))
                    try {
                        Thread.sleep(100);
                    } finally {
                        lock2.unlock();
                    }
            }
        } finally {
            lock1.unlock();
        }
    }


    public static void main(String[] args) {
//        PreventDeadLock preventDeadLock = new PreventDeadLock();
//        Thread t1 = new Thread(preventDeadLock::method1);
//        Thread t2 = new Thread(() -> preventDeadLock.method2());
//        t1.start();
//        t2.start();
    }
}

