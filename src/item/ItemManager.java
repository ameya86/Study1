package item;

import java.util.Random;


public class ItemManager {
    private static ItemList list = new ItemList();

    public static Item create(String itemName, int price) {
    	Item item = new Item(new ItemInfo(
    			                 randomId(),
                                 new ItemName(itemName)
    			             ), new Money(price));
    	ItemManager.list.add(item);

        return item;
    }

    public static Item find(ItemId id) {
        return ItemManager.list.find(id);
    }

    private static ItemId randomId() {
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        builder.appendCodePoint('A' + rand.nextInt('Z' - 'A' + 1));
        for (int count = 0; count < 9; count++) {
            builder.append(rand.nextInt(10));
        }

        return new ItemId(builder.toString());
    }
}
