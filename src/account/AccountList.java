package account;

import java.util.LinkedList;
import java.util.List;

public class AccountList {
    private List<Account> list;

    public AccountList() {
        this.list = new LinkedList<Account>();
    }

    public boolean add(Account account) {
        if (!this.list.contains(account)) {
            return false;
        }

        return this.list.add(account);
    }

    public Account find(AccountId id) {
        for (Account a : this.list) {
            if (a.checkId(id)) {
                return a;
            }
        }
        return null;
    }
}
