package item;


public class Item {
    private Money price;
    private ItemInfo info;

    public Item(ItemInfo info, Money price) {
        this.info = info;
        this.price = price;
    }

    public ItemDTO fields() {
    	ItemDTO dto = new ItemDTO();
    	this.info.copyValue(dto);
    	this.price.copyValue(dto);
    	return dto;
    }
}
