package com.java.designpatterns.abstract_factory.example;

import com.java.designpatterns.abstract_factory.example.app.Application;
import com.java.designpatterns.abstract_factory.example.factories.GUIFactory;
import com.java.designpatterns.abstract_factory.example.factories.MacOSFactory;
import com.java.designpatterns.abstract_factory.example.factories.WindowsFactory;

public class Demo {
    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
