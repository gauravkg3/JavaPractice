package InterviewQuestion;

public class RunnaleThread implements Runnable {

    DeadLock deadLock;

    RunnaleThread(DeadLock deadLock) {
        this.deadLock = deadLock;
    }

    public void run() {
        deadLock.method1();
    }
}
