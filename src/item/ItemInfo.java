package item;

public class ItemInfo {
    private ItemId id;
    private ItemName name;

    public ItemInfo(ItemId id, ItemName name) {
        this.id = id;
        this.name = name;
    }

    public ItemDTO copyValue(ItemDTO dto) {
        this.id.copyValue(dto);
        this.name.copyValue(dto);
        return dto;
    }
}
