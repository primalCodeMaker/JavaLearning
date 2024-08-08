package org.designPatterns.behavioral.observer.newsleetterNormalAndLambda;

public class Main {

    public static void main(String[] args) {

        NewsTopic subject = new NewsTopic();

        Observer observer1 = new NewSubscriber("observer1");
        Observer observer2 = new NewSubscriber("observer2");
        Observer observer3 = new NewSubscriber("observer3");

        subject.register(observer1);
        subject.register(observer2);
        subject.register(observer3);

        subject.setNews("Some new News!!!");

    }
}