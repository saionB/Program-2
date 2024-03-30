public class Menu {
  private static final int MAX_MENU_ITEMS = 10;
  
  private MenuItem[] menu_items;
  
  private int current_index = 0; // to only be used by
                                 // iterator methods below
  // Constructor
  public Menu() {
  // -----------------------------------------------------------
  // Creates and initializes menu_items array to size 10 with
  // all nulls.
  // -----------------------------------------------------------
  // (to complete)
    this.menu_items = new MenuItem[MAX_MENU_ITEMS];
  }

  // Method
  public int numItems() {
  // -----------------------------------------------------------
  // Returns the current number of items in the menu.
  // -----------------------------------------------------------
  // (to complete)
    return current_index;
  }

  // Method
  public void add(MenuItem menu_item) throws NumberMenuItemsExceededException {
    if (current_index >= MAX_MENU_ITEMS) {
      throw new NumberMenuItemsExceededException("Number of Menu Items Exceeded");
    }
    menu_items[current_index] = menu_item;
    current_index++; 
  // -----------------------------------------------------------
  // Adds menu item to next available space in array menu_items.
  //
  // Throws NumberMenuItemsExceededException if menu_items array
  // is full.
  // -----------------------------------------------------------
  // (to complete)

  }

  // Method
  public MenuItem getMenuItemByListing(int n) throws MenuItemNotFoundException {
    if (n < 1 || n > current_index) {
      throw new MenuItemNotFoundException("Menu item not found");
    }
    return menu_items[n - 1];                           
  // -----------------------------------------------------------
  // Returns nth MenuItem (object) from the listed menu items.
  //
  // Throws MenuItemNotFoundException if n is outside the
  // range of 1..numItems().
  // -----------------------------------------------------------
  // (to complete)
  }

  // Method
  public MenuItem getMenuItemByID(String item_ID) throws MenuItemNotFoundException {
    for (MenuItem menuItem : menu_items) {
      if (menuItem != null && menuItem.getItemID().equals(item_ID)) {
        return menuItem;
      }
    }
    throw new MenuItemNotFoundException("Menu item not found");
  // -----------------------------------------------------------
  // Returns MenuItem (object) for given item_ID.
  //
  // Throws MenuItemNotFoundException if menu item with item_ID
  // not found.
  // -----------------------------------------------------------
  // (to complete)
  }

  // -----------------------------------------------------------
  // Iterator Methods
  // -----------------------------------------------------------
  // These methods are used to iterate over the menu items.
  // Items may be iterated over multiple times by calling reset
  // to begin at the first menu item again.
  //
  // NOTE: These methods use instance variable current_index
  //       which no other methods should use.
  // -----------------------------------------------------------
  
  public void reset() {
  // -----------------------------------------------------------
  // Resets to first order of list of menu items.
  // -----------------------------------------------------------
  // (to complete)
    current_index = 0;
  }

  public boolean hasNext() {
  // -----------------------------------------------------------
  // Returns true if there exists another menu item to retrieve.
  // Otherwise, returns false.
  // -----------------------------------------------------------
  // (to complete)
    return current_index < numItems();

  }
  
  public MenuItem next() {
  // -----------------------------------------------------------
  // Returns next menu item in list of menu items.
  // (Must only be called when hasNext() is true.)
  // -----------------------------------------------------------
  // (to complete)
    return menu_items[current_index++];
  
  }
  
}