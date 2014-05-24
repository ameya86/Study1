package item;

public class ItemName {
    private String name;

    public ItemName(String name) {
        this.name = name;
    }

    public ItemDTO copyValue(ItemDTO dto) {
        dto.name = this.name;
        return dto;
    }
}
