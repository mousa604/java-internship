import java.util.ArrayList;
import java.util.List;

public class Library {
    private ArrayList<Item> items =new ArrayList<Item>();

    // Add an item to the library
    public void addItem(Item item) {
        items.add(item);
    }

    // Remove an item from the library
    public void removeItem(Item item) {
        items.remove(item);
    }

    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getClass().getName());
            item.displayInfo();
            System.out.println("----------------------------------");
        }
    }


}
