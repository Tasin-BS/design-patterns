package com.java.designpatterns.factorypatterns.example.factory;

import com.java.designpatterns.factorypatterns.example.buttons.Button;
import com.java.designpatterns.factorypatterns.example.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
