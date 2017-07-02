package shop;
import behaviours.*;

public class Drumsticks implements Sellable {
  double price_buy;
  double price_sell;
  String type;

  public Drumsticks(double price_buy, double price_sell, String type) {
    this.price_buy = price_buy;
    this.price_sell = price_sell;
    this.type = type;
  }

  public double getPriceBuy() {
    return this.price_buy;
  }

  public double getPriceSell() {
    return this.price_sell;
  }

  public String getType() {
    return this.type;
  }

  public double calculateMarkup() {
    return this.price_sell - this.price_buy;
  }

}