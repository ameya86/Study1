package item;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
    private List<Item> list;

    public ItemList() {
        this.list = new ArrayList<Item>();
    }

    public boolean add(Item item) {
        return this.list.add(item);
    }

    public Item find(ItemId id) {
        for (Item t : this.list) {
            if (t.checkId(id)) {
                return t;
            }
        }
        return null;
    }
}
