package com.aparna.DSPractice.java8.designpattern.factory;

public class PushNotificationSender implements  NotificationSender{
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Push to " + to + ": " + message);
    }
}
