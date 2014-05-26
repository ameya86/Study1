package account;

public class Account {
    private AccountId id;
    private UserName name;

    public Account(AccountId id, UserName name) {
        this.id = id;
        this.name = name;
    }

    public boolean checkId(AccountId id2) {
        return this.id.equals(id2);
    }

    public AccountDTO fields() {
        AccountDTO dto = new AccountDTO();
        this.id.copyValue(dto);
        this.name.copyValue(dto);
        return dto;
    }
}
