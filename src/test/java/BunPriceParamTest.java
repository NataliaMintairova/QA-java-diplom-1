import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunPriceParamTest {
    private final String name;
    private final float price;
    private final float expected;

    public BunPriceParamTest(String name, float price, float expected){
        this.name = name;
        this.price = price;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getBunName() {
        return new Object[][] {
                {"Двойной", 550.00f, 550.00f},
                {"Двойной", -550.00f, -550.00f},
                {"Двойной", 0, 0},
                {"Двойной", 1.1f, 1.1f},
                {"Двойной", 55000000, 55000000},
        };
    }
    @Test
    public void returnPriceTest(){
        Bun bun = new Bun(name, price);
        float actual = bun.getPrice();
        assertEquals(expected, actual, 0);
    }
}
