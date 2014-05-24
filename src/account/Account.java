package account;

public class Account {
    private AccountId id;
    private UserName name;

    public Account(AccountId id, UserName name) {
        this.id = id;
        this.name = name;
    }

    public AccountDTO fields() {
        AccountDTO dto = new AccountDTO();
        return dto;
    }
}
