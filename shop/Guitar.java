package shop;
import behaviours.*;

public class Guitar extends Instrument implements Playable {
  String type;
  int strings;

  public Guitar(String family, String material, String colour, String type, int strings) {
    super(family, material, colour);
    this.type = type;
    this.strings = strings;
  }

  public String getType() {
    return this.type;
  }

  public int getStrings() {
    return this.strings;
  }

  public String play() {
    return "Kerrang!";
  }

}