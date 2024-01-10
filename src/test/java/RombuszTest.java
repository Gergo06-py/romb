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
    public void calcArea_30() {
        double actual = this.rombusz.calcArea(30, 45);
        double expected = 636.3;
        Assert.assertEquals(actual, expected, 0.1);
    }
}
