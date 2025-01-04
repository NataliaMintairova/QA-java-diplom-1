import org.junit.Before;
import org.junit.Test;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;
import static praktikum.IngredientType.SAUCE;

public class IngredientTest {
    Ingredient ingredient;
    @Before
    public void init() {
        ingredient = new Ingredient(SAUCE, "ДорБлю", 550);
    }
    @Test
    public void returnNameTest(){
        String expectedResult = "ДорБлю";
        String actualResult = ingredient.getName();
        assertEquals(expectedResult, actualResult);
}
    @Test
    public void returnPriceTest() {
        float expectedResult = 550;
        float actualResult = ingredient.getPrice();
        assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void returnTypeTest() {
        IngredientType expectedResult = SAUCE;
        IngredientType actualResult = ingredient.getType();
        assertEquals(expectedResult, actualResult);
    }
}
