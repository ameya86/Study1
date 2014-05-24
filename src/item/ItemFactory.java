package item;

public class ItemFactory {
    public static Item create(String id, String name, int price) {
        return new Item(new ItemInfo(
                            new ItemId(id),
                            new ItemName(name)
                       ),
                       new Money(price));
    }
}
