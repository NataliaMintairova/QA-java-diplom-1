import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
    public class BunNameParamTest {
        private final String name;
        private final float price;
        private final String expected;

        public BunNameParamTest(String name, float price, String expected){
            this.name = name;
            this.price = price;
            this.expected = expected;
        }

    @Parameterized.Parameters
        public static Object[][] getBunName() {
            return new Object[][] {
                    {"", 550, ""},
                    {null, 550, null},
                    {"Оады двшп фджывлп фдвлпр фждывл фыдлвоа фшывоад жвшаф", 550, "Оады двшп фджывлп фдвлпр фждывл фыдлвоа фшывоад жвшаф"},
                    {"%ur&#", 550, "%ur&#"},
                    {"Двойной", 550, "Двойной"},
            };
        }
    @Test
    public void returnNameTest(){
        Bun bun = new Bun(name, price);
        String actual = bun.getName();
        assertEquals(expected, actual);
    }
}
