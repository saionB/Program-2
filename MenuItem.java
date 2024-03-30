public class MenuItem {
  
  private String item_name;
  private String item_ID;
  private String num_calories;
  private String price;
  private boolean heart_healthy;

  // Constructor 
  public MenuItem (String item_name, String item_ID, 
                   String num_calories, String price, 
                   boolean heart_healthy) {
  // ------------------------------------------------------
  // Initializes instance vars to parameter values passed.
  // ------------------------------------------------------
// (to complete)
    this.item_name = item_name;
    this.item_ID = item_ID;
    this.num_calories = num_calories;
    this.price = price;
    this.heart_healthy = heart_healthy;
  }

  // Getters

  public String getItemID() {
  // ------------------------------------------------------
  // Returns value of instance var Item_ID.
  // ------------------------------------------------------
 // (to complete)
    return this.item_ID;

  }

  public String getPrice() {
  // ------------------------------------------------------
  // Returns value of instance var price.
  // ------------------------------------------------------  
  // (to complete)
    return this.price;

  }

  public boolean isHeartHealthy() {
  // ------------------------------------------------------
  // Returns value of instance var heart_healthy.
  // ------------------------------------------------------  
  // (to complete)
    return this.heart_healthy;

  }

  public String getBasicDescription() {
  // ------------------------------------------------------
  // Returns description containing only the item name
  // and the price, e.g., "Baked Salmon $23.50".
  // ------------------------------------------------------
  // (to complete)
    return this.item_name + " " + this.price;

  }

  // toString method
  
  public String toString() {
  // ------------------------------------------------------
  // Returns string of the form:
  //
  // "Braised Short Ribs (450 cal.) $26.00"
  // "Baked Salmon (260 cal.) $23.50 (Heart Healthy)"
  //
  // Note that item_ID NOT part of the returned string.
  // (It is only used internally)
  // ------------------------------------------------------
  // (to complete)
    String description = this.item_name + " (" + this.num_calories + " cal.) " + this.price;
    if (this.heart_healthy) {
      description += " (Heart Healthy)";
    }
    return description;
  }
  
}