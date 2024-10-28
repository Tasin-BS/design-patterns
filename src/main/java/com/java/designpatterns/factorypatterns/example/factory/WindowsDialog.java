package com.java.designpatterns.factorypatterns.example.factory;

import com.java.designpatterns.factorypatterns.example.buttons.Button;
import com.java.designpatterns.factorypatterns.example.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}