package item;

public class ItemId {
    private String id;

    public ItemId(String id) {
        this.id = id;
    }

    public ItemDTO copyValue(ItemDTO dto) {
        dto.id = this.id;
        return dto;
    }
}
