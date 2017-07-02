package shop;
import behaviours.*;

public class Triangle extends Instrument implements Playable, Sellable {

  public Triangle(double price_buy, double price_sell, InstrumentFamily family, String material, String colour) {
    super(price_buy, price_sell, family, material, colour);
  }

  public String play() {
    return "Ting!";
  }

  public double calculateMarkup() {
    return this.price_sell - this.price_buy;
  }

}