package com.java.designpatterns.abstract_factory.example.buttons;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
