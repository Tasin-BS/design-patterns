package com.java.designpatterns.abstract_factory.example.factories;

import com.java.designpatterns.abstract_factory.example.buttons.Button;
import com.java.designpatterns.abstract_factory.example.buttons.MacOSButton;
import com.java.designpatterns.abstract_factory.example.checkboxes.Checkbox;
import com.java.designpatterns.abstract_factory.example.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
