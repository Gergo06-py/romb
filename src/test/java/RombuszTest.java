import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.example.Rombusz;

public class RombuszTest {
    Rombusz rombusz;

    @BeforeTest
    public void setup() {
        rombusz = new Rombusz();
    }

    @Test
    public void calcArea() {
        rombusz.calcArea();
    }
}
