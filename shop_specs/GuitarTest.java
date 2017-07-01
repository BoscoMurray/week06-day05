import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar(200, 500, "string", "wood", "black", "accoustic", 6);
  }

  @Test
  public void canGetFamily() {
    assertEquals("string", guitar.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("wood", guitar.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("black", guitar.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals("accoustic", guitar.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(200, guitar.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(500, guitar.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(300, guitar.calculateMarkup(), 0.01);
  }

}