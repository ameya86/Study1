package account;

public class AccountId {
    private String id;

    public AccountId(String id) {
        this.id = id;
    }

    public AccountDTO copyValue(AccountDTO dto) {
        dto.id = this.id;
        return dto;
    }
}
