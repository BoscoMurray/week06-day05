import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class ShopTest {

  Shop shop;
  Bassoon bassoon;
  Drumsticks drumsticks;
  Triangle triangle;

  @Before
  public void before() {
    shop = new Shop();
    bassoon = new Bassoon(5000, 7500, InstrumentFamily.WOODWIND, "wood", "brown", "contra");
    drumsticks = new Drumsticks(7.5, 20, "drumsticks");
    triangle = new Triangle(10, 25, InstrumentFamily.PERCUSSION, "steel", "silver");
  }

  @Test
  public void stockCountStartsZero() {
    assertEquals(0, shop.stockCount());
  }

  @Test
  public void canAddItem() {
    shop.addItem(bassoon);
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canRemoveItem() {
    shop.addItem(bassoon);
    shop.addItem(drumsticks);
    shop.removeItem();
    assertEquals(1, shop.stockCount());
  }

  @Test
  public void canGetPotentialProfit() {
    shop.addItem(bassoon);
    shop.addItem(drumsticks);
    shop.addItem(triangle);
    assertEquals(2527.5, shop.potentialProfit(), 0.01);
  }

}