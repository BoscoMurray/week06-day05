import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class TriangleTest {

  Triangle triangle;

  @Before
  public void before() {
    triangle = new Triangle(10, 25, InstrumentFamily.PERCUSSION, "steel", "silver");
  }

  @Test
  public void canGetFamily() {
    assertEquals(InstrumentFamily.PERCUSSION, triangle.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("steel", triangle.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("silver", triangle.getColour());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(10, triangle.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(25, triangle.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(15, triangle.calculateMarkup(), 0.01);
  }

}