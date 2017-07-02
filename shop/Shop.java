package shop;

import behaviours.*;
import java.util.*;

public class Shop {

  private ArrayList<Sellable> stock;

  public Shop() {
    this.stock = new ArrayList<Sellable>();
  }

  public int stockCount() {
    return this.stock.size();
  }

  public void addItem(Sellable item) {
    this.stock.add(item);
  }

  public Sellable removeItem(){
    if(stockCount() > 0) {
      return this.stock.remove(0);
    }
    return null;
  }

}