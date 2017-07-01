import static org.junit.Assert.*;
import org.junit.*;
import shop.*;

public class TriangleTest {

  Triangle triangle;

  @Before
  public void before() {
    triangle = new Triangle("percussion", "steel", "silver");
  }

  @Test
  public void canGetFamily() {
    assertEquals("percussion", triangle.getFamily());
  }

  @Test
  public void canGetMaterial() {
    assertEquals("steel", triangle.getMaterial());
  }

  @Test
  public void canGetColour() {
    assertEquals("silver", triangle.getColour());
  }

}