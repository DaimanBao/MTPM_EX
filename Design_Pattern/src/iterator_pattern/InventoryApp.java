package iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class InventoryApp {
	public static void main(String[] args) {
		List<Item> inventory = new ArrayList<>();
        inventory.add(new Item("Laptop", true));
        inventory.add(new Item("Mouse", false));
        inventory.add(new Item("Keyboard", true));
        inventory.add(new Item("Monitor", false));

        Iterator<Item> iterator = new InStockIterator(inventory);

        System.out.println("--- Danh sách sản phẩm còn hàng ---");
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println("Sản phẩm: " + item.getName());
        }
	}
}
