package com.java.designpatterns.abstract_factory.example.checkboxes;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
