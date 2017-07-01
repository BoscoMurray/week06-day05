package shop;
import behaviours.*;

public class Triangle extends Instrument implements Playable {

  public Triangle(String family, String material, String colour) {
    super(family, material, colour);
  }

  public String play() {
    return "Ting!";
  }

}