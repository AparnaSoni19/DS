package com.aparna.DSPractice.java8.designpattern.factory;

public class SMSNotificationSender implements  NotificationSender{
    @Override
    public void send(String to, String message) {
        System.out.println("Sending SMS to " + to + ": " + message);
    }
}
