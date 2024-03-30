public class Check {

  private Menu menu;
  private Orders orders;
  private double tax_rate;

  // Constructor
  public Check(Menu menu, Orders orders, double tax_rate) {

    this.menu = menu;
    this.orders = orders;
    this.tax_rate = tax_rate;
  }

  // Getter Methods
 
  public Orders getOrders() {

    return this.orders;
  }

  public double getTaxRate() {

    return this.tax_rate;
  }

  // Method
  public double tax() {

    double subtotal = subtotal();
    return subtotal * this.tax_rate;
  }

  // Method
  public double subtotal() {

    double total = 0.0;
    Orders orders = this.orders;
    Menu menu = this.menu;

    orders.reset();
    while (orders.hasNext()) {
      try {
        MenuItem item = menu.getMenuItemByID(orders.next());
        total += Double.parseDouble(item.getPrice());
      } catch (MenuItemNotFoundException e) {
        // Handle exception
      }
    }

    return total;
  }

  // Method
  public double total() {

    return subtotal() + tax();
  }

  public double compute_tip(int percent) {

    double total = total();
    return total * percent / 100.0;
  }
  
}