package shop;
import behaviours.*;

public class Piano extends Instrument implements Playable, Sellable {
  String type;

  public Piano(double price_buy, double price_sell, InstrumentFamily family, String material, String colour, String type) {
    super(price_buy, price_sell, family, material, colour);
    this.type = type;
  }

  public String getType() {
    return this.type;
  }

  public String play() {
    return "Dldldldlum!";
  }

  public double calculateMarkup() {
    return this.price_sell - this.price_buy;
  }

}