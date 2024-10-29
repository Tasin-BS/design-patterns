package com.java.designpatterns.decoretors.example.decorators;

public interface DataSource {
    void writeData(String data);

    String readData();
}
