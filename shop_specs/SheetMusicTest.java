import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class SheetMusicTest {

  SheetMusic sheetmusic;

  @Before
  public void before() {
    sheetmusic = new SheetMusic(5, 25, "sheetmusic");
  }

  @Test
  public void canGetType() {
    assertEquals("sheetmusic", sheetmusic.getType());
  }

  @Test
  public void canGetPriceBuy() {
    assertEquals(5, sheetmusic.getPriceBuy(), 0.01);
  }

  @Test
  public void canGetPriceSell() {
    assertEquals(25, sheetmusic.getPriceSell(), 0.01);
  }

  @Test
  public void canCalculateMarkup() {
    assertEquals(20, sheetmusic.calculateMarkup(), 0.01);
  }

}