import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class BassoonTest {

  Bassoon bassoon;

  @Before
  public void before() {
    bassoon = new Bassoon("woodwind", "wood", "brown", "contra");
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

}