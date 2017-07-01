package shop;
import behaviours.*;

public class Bassoon extends Instrument implements Playable {
  String type;

  public Bassoon(String family, String material, String colour, String type) {
    super(family, material, colour);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public String play() {
    return "Paarrrpp!";
  }

}