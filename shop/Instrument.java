package shop;

public abstract class Instrument {
  double price_buy;
  double price_sell;
  InstrumentFamily family;
  String material;
  String colour;

  public Instrument(double price_buy, double price_sell, InstrumentFamily family, String material, String colour) {
    this.price_buy = price_buy;
    this.price_sell = price_sell;
    this.family = family;
    this.material = material;
    this.colour = colour;
  }

  public double getPriceBuy() {
    return this.price_buy;
  }

  public double getPriceSell() {
    return this.price_sell;
  }

  public InstrumentFamily getFamily() {
    return this.family;
  }

  public String getMaterial() {
    return this.material;
  }

  public String getColour() {
    return this.colour;
  }

}