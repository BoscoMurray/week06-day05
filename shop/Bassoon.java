package shop;
import behaviours.*;

public class Bassoon extends Instrument implements Playable, Sellable {
  String type;

  public Bassoon(double price_buy, double price_sell, String family, String material, String colour, String type) {
    super(price_buy, price_sell, family, material, colour);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public String play() {
    return "Paarrrpp!";
  }

  public double calculateMarkup() {
    return this.price_sell - this.price_buy;
  }

}