package shop;
import behaviours.*;

public class Guitar extends Instrument implements Playable, Sellable {
  String type;
  int strings;

  public Guitar(double price_buy, double price_sell, InstrumentFamily family, String material, String colour, String type, int strings) {
    super(price_buy, price_sell, family, material, colour);
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

  public double calculateMarkup() {
    return this.price_sell - this.price_buy;
  }

}