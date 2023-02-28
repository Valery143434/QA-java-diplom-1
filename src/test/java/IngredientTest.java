import praktikum.IngredientType;
import org.junit.Test;
import org.junit.runners.Parameterized;
import static praktikum.IngredientType.FILLING;
import static praktikum.IngredientType.SAUCE;
import praktikum.Ingredient;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class IngredientTest {
    private final float price;
    private final String name;
    private final IngredientType type;

    public IngredientTest(IngredientType type, String name, float price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }
    @Parameterized.Parameters(name = "тип: {0}, название: {1}, цена:{2} ")
    public static Object[][] dataForTest() {
        return new Object[][]{
                {SAUCE, "сырный соус", 0.01f},
                {SAUCE, "", 100},
                {FILLING, null, 100},
                {null, "кетчуп", 100}
        };
    }
    @Test
    public void getPriceTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка", price, ingredient.getPrice(), 0.0f);
    }
    @Test
    public void getNameTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка", name, ingredient.getName());
    }
    @Test
    public void getTypeTest() {
        Ingredient ingredient = new Ingredient(type, name, price);
        assertEquals("Ошибка", type, ingredient.getType());
    }
}