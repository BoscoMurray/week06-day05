import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class BassoonTest {

  Bassoon bassoon;

  @Before
  public void before() {
    bassoon = new Bassoon(5000, 7500, "woodwind", "wood", "brown", "contra");
  }

  @Test
  public void canGetFamily() {
    assertEquals("woodwind", bassoon.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("wood", bassoon.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("brown", bassoon.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals("contra", bassoon.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(5000, bassoon.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(7500, bassoon.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(2500, bassoon.calculateMarkup(), 0.01);
  }

}