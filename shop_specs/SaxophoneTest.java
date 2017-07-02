import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class SaxophoneTest {

  Saxophone saxophone;

  @Before
  public void before() {
    saxophone = new Saxophone(200, 500, InstrumentFamily.WOODWIND, "brass", "brass", "alto");
  }

  @Test
  public void canGetFamily() {
    assertEquals(InstrumentFamily.WOODWIND, saxophone.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("brass", saxophone.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("brass", saxophone.getColour());
  }

  @Test
  public void canGetType() {
    assertEquals("alto", saxophone.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(200, saxophone.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(500, saxophone.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(300, saxophone.calculateMarkup(), 0.01);
  }

}