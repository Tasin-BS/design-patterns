package com.java.designpatterns.abstract_factory.example.factories;

import com.java.designpatterns.abstract_factory.example.buttons.Button;
import com.java.designpatterns.abstract_factory.example.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
