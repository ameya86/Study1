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

    public boolean equals(Object obj) {
        if (obj instanceof String) {
            return this.id.equals(obj);
        }

        if (!(obj instanceof AccountId)) {
            return false;
        }

        return obj.equals(this.id);
    }
}
