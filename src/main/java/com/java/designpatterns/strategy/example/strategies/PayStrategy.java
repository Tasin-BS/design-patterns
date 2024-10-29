package com.java.designpatterns.strategy.example.strategies;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
