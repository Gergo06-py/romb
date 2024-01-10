/*
    * File: Rombusz.java
    * Author: Borbély Gergő Árpád
    * Copyright: 2024, Borbély Gergő Árpád
    * Date: 2024-01-10
    * Web: https://github.com/Gergo06-py/romb
    * Licenc: MIT
*/

package com.example;

public class Rombusz {
    public double calcPerimeter(double side) {
        if (side <= 0)
            throw new IllegalArgumentException();

        return 4 * side;
    }

    public double calcArea(double side, double deg) {
        if (side <= 0 || deg <= 0)
            throw new IllegalArgumentException();

        double rad = deg / 180 * Math.PI;

        return Math.pow(side, 2) * Math.sin(rad);
    }
}
