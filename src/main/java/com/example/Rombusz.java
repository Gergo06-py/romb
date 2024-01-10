package com.example;

public class Rombusz {
    public double calcArea(double side, double deg) {
        double rad = deg / 180 * Math.PI;
        return Math.pow(side, 2) * Math.sin(rad);
    }
}
