/*
    * File: RombuszTest.java
    * Author: Borbély Gergő Árpád
    * Copyright: 2024, Borbély Gergő Árpád
    * Date: 2024-01-10
    * Web: https://github.com/Gergo06-py/romb
    * Licenc: MIT
*/

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.Rombusz;

public class RombuszTest {
    Rombusz rombusz;

    @BeforeTest
    public void setup() {
        this.rombusz = new Rombusz();
    }

    @Test
    public void calcPerimeter_58() {
        double actual = this.rombusz.calcPerimeter(58);
        double expected = 232.0;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void calcPerimeter_83() {
        double actual = this.rombusz.calcPerimeter(83);
        double expected = 332.0;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcPerimeterNull() {
        this.rombusz.calcPerimeter(0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcPerimeterMinus() {
        this.rombusz.calcPerimeter(-1);
    }

    @Test
    public void calcArea_30_45() {
        double actual = this.rombusz.calcArea(30, 45);
        double expected = 636.3;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void calcArea_120_60() {
        double actual = this.rombusz.calcArea(120, 60);
        double expected = 12470.7;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcAreaNullSide() {
        this.rombusz.calcArea(0, 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcAreaMinusSide() {
        this.rombusz.calcArea(-1, 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcAreaNullDeg() {
        this.rombusz.calcArea(1, 0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void calcAreaMinusDeg() {
        this.rombusz.calcArea(1, -1);
    }
}
