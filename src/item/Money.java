package item;

public class Money {
    private int money;

    public Money(int money) {
        this.money = money;
    }

    public ItemDTO copyValue(ItemDTO dto) {
        dto.money = this.money;
        return dto;
    }
}
