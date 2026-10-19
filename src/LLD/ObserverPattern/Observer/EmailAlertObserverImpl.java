package LLD.ObserverPattern.Observer;

import LLD.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    String emailId;
    StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.observable = observable;
        this.emailId = emailId;
    }


    @Override
    public void update() {
        sendMail(emailId, "Product is in stock hurry up!");
    }

    private void sendMail(String emailId, String msg) {
        System.out.println("Email sent to:" + emailId);
        //send the actual email  to the end user
    }
}
