package com.java.designpatterns.factorypatterns.example.factory;

import com.java.designpatterns.factorypatterns.example.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }
    public abstract Button createButton();
}
