package com.aparna.DSPractice.java8.designpattern.factory;

public class EmailNotificationSender implements  NotificationSender{
    @Override
    public void send(String to, String message) {
        System.out.println("Sending Email to " + to + ": " + message);
    }
}
