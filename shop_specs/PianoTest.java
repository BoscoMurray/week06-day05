import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano(6000, 10000, InstrumentFamily.KEYBOARD, "wood", "brown", "upright");
  }

  @Test
  public void canGetFamily() {
    assertEquals(InstrumentFamily.KEYBOARD, piano.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("wood", piano.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("brown", piano.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals("upright", piano.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(6000, piano.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(10000, piano.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(4000, piano.calculateMarkup(), 0.01);
  }

}