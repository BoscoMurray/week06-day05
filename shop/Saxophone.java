package shop;
import behaviours.*;

public class Saxophone extends Instrument implements Playable {
  String type;

  public Saxophone(String family, String material, String colour, String type) {
    super(family, material, colour);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public String play() {
    return "Dooo do do doo!";
  }

}