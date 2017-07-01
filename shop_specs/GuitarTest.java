import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class GuitarTest {

  Guitar guitar;

  @Before
  public void before() {
    guitar = new Guitar("string", "wood", "black", "accoustic", 6);
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

}