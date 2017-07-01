import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class SaxophoneTest {

  Saxophone saxophone;

  @Before
  public void before() {
    saxophone = new Saxophone("woodwind", "brass", "brass", "alto");
  }

  @Test
  public void canGetFamily() {
    assertEquals("woodwind", saxophone.getFamily());
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

}