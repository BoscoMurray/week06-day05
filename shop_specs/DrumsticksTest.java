import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class DrumsticksTest {

  Drumsticks drumsticks;

  @Before
  public void before() {
    drumsticks = new Drumsticks(7.5, 20, "drumsticks");
  }

  @Test
  public void canGetType() {
    assertEquals("drumsticks", drumsticks.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(7.5, drumsticks.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(20, drumsticks.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(12.5, drumsticks.calculateMarkup(), 0.01);
  }

}