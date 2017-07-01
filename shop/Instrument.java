package shop;

public abstract class Instrument {
  String family;
  String material;
  String colour;

  public Instrument(String family, String material, String colour) {
    this.family = family;
    this.material = material;
    this.colour = colour;
  }

  public String getFamily() {
    return this.family;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

}