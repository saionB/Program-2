import java.util.Arrays;

public class Orders {
  private static final int MAX_NUM_ORDERS = 4;

  // Stores menu item IDs for all orders
  private String[] ordered_items;

  // Only to be used by iterator methods
  private int current_index = 0;

  // Constructor
  public Orders(int max_num_orders) {
  // ------------------------------------------------------
  // Initalizes item_numbers array to size max_num_orders
  // and initializes to all nulls.
  // ------------------------------------------------------
// (to complete)
    this.ordered_items = new String[max_num_orders];

  }

  // Method
  public int numOrders() {
  // ------------------------------------------------------
  // Returns the current number of ordered items.
  // ------------------------------------------------------
  // (to complete)
    return current_index;

  }

  // Method
  public void add(String item_number) throws NumberOrdersExceededException {
  // ------------------------------------------------------
  // Adds item_number to next available space in array 
  // ordered_items.
  //
  // Throws NumberOrdersExceededException if ordered_items
  // array is full.
  // ------------------------------------------------------
  // (to complete)
    if (current_index >= ordered_items.length) {
      throw new NumberOrdersExceededException("Number of orders exceeded");
    }
    ordered_items[current_index++] = item_number;
  }

    public void cancelOrder(int index) throws IndexOutOfBoundsException {
    if (index < 0 || index >= current_index) {
      throw new IndexOutOfBoundsException("Invalid order index");
    }
    // Shift remaining orders to fill the gap
    for (int i = index; i < current_index - 1; i++) {
      ordered_items[i] = ordered_items[i + 1];
    }
    ordered_items[current_index - 1] = null;
    current_index--;
  }

  // Method to get the ordered items
  public String[] getOrderedItems() {
    return Arrays.copyOf(ordered_items, current_index);
  }

  // ------------------------------------------------------
  // Iterator Methods
  // ------------------------------------------------------
  // These methods used to iterate over the ordered items.
  // Items may be iterated over multiple times by calling
  // reset to begin at the first menu item again.
  //
  // NOTE: These methods use instance variable current_index
  //       which no other methods should use.
  // ------------------------------------------------------

  public void reset() {
  // ------------------------------------------------------
  // Resets to first ordered item.
  // ------------------------------------------------------
  // (to complete)
    current_index = 0;

  }

  public boolean hasNext() {
  // ------------------------------------------------------
  // Returns true if there exists another ordered item to
  // retrieve. Otherwise, returns false.
  // ------------------------------------------------------
  // (to complete)
    return current_index < numOrders();

  }

  public String next() {
  // ------------------------------------------------------
  // Returns next order item in array of ordered items.
  // (Must only be called when hasNext() is true.)
  // ------------------------------------------------------
  // (to complete)
    return ordered_items[current_index++];
  }
  public class NumberOrdersExceededException extends Exception {
    public NumberOrdersExceededException(String message) {
        super(message);
      } 
  }
}