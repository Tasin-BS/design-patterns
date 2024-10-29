package com.java.designpatterns.adapter.example.adapters;

import com.java.designpatterns.adapter.example.round.RoundPeg;
import com.java.designpatterns.adapter.example.square.SquarePeg;

public class SquarePegAdater extends RoundPeg {
    private SquarePeg peg;

    public SquarePegAdater(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // EN: Calculate a minimum circle radius, which can fit this peg.
        //
        // RU: Рассчитываем минимальный радиус, в который пролезет этот колышек.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}