package com.java.designpatterns.abstract_factory.example.factories;

import com.java.designpatterns.abstract_factory.example.buttons.Button;
import com.java.designpatterns.abstract_factory.example.buttons.WindowsButton;
import com.java.designpatterns.abstract_factory.example.checkboxes.Checkbox;
import com.java.designpatterns.abstract_factory.example.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
