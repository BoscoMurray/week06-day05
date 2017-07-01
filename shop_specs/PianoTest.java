import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class PianoTest {

  Piano piano;

  @Before
  public void before() {
    piano = new Piano("keyboard", "wood", "brown", "upright");
  }

  @Test
  public void canGetFamily() {
    assertEquals("keyboard", piano.getFamily());
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

}