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
    public void calcPerimeter_30() {
        double actual = this.rombusz.calcPerimeter(30);
        double expected = 120.0;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test
    public void calcPerimeter_120() {
        double actual = this.rombusz.calcPerimeter(120);
        double expected = 360.0;
        Assert.assertEquals(actual, expected, 0.1);
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
    public void calcAreaNullDeg() {
        this.rombusz.calcArea(1, 0);
    }
}
