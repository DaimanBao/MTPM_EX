package iterator_pattern;

import java.util.List;

public class InStockIterator implements Iterator<Item> {
	private List<Item> items;
    private int position = 0;

    public InStockIterator(List<Item> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        while (position < items.size()) {
            if (items.get(position).isInStock()) {
                return true;
            }
            position++;
        }
        return false;
    }

    @Override
    public Item next() {
        return items.get(position++);
    }
}
