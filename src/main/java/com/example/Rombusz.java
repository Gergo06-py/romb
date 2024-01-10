package com.example;

public class Rombusz {
    public double calcPerimeter() {
        return 0.0;
    }

    public double calcArea(double side, double deg) {
        if (side == 0 || deg == 0)
            throw new IllegalArgumentException();
        double rad = deg / 180 * Math.PI;
        return Math.pow(side, 2) * Math.sin(rad);
    }
}
