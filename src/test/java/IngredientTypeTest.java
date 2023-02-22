import praktikum.IngredientType;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class IngredientTypeTest {
    @Test
    public void IngredientTypeSauceTest() {
        assertNotNull(IngredientType.valueOf("FILLING"));
    }
    @Test
    public void IngredientTypeFillingTest() {
        assertNotNull(IngredientType.valueOf("SAUCE"));
    }
}