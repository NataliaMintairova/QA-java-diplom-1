import net.bytebuddy.build.ToStringPlugin;
import org.junit.Test;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

public class IngredientTypeTest {
    IngredientType type;
    @Test
    public void sizeEnumTest(){
        int expectedResult = 2;
        int actualResult = type.values().length;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void enumHasSauseTest(){
        String expectedResult = "SAUCE";
        String actualResult = type.SAUCE.toString();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void enumHasFillingTest(){
        String expectedResult = "FILLING";
        String actualResult = type.FILLING.toString();
        assertEquals(expectedResult, actualResult);
    }
}
