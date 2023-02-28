import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private final String name;
    private final float price;
    public BunTest(String name, float price) {
        this.name = name;
        this.price = price;
    }
    @Parameterized.Parameters(name = "название: {0}, цена: {1}")
    public static Object[][] dataTests() {
        return new Object[][]{
                {"", 200},
                {"sesamebunsesamebunsesamebun", 200},
                {null, 200},
                {"$esame bun", 200},
                {"sesame bun", 0},
                {"sesame bun", 1},
                {"sesame bun", 600},
                {"sesame bun", 200}
        };
    }
    @Test
    public void getNameAndPriceTest() {
        Bun bun = new Bun(name, price);
        assertEquals("Ошибка с названием", name, bun.getName());
        assertEquals("Ошибка с ценой", price, bun.getPrice(), 0.0f);
    }
}