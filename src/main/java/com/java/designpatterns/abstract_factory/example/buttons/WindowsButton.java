package com.java.designpatterns.abstract_factory.example.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
