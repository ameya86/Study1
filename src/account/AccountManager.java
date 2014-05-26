package account;

import java.util.Random;

public class AccountManager {
    private static AccountList list = new AccountList();

    public static Account create(String firstName, String lastName) {
        Account account = new Account(randomId(),
                                      new UserName(
                                          new UserNamePart(firstName),
                                          new UserNamePart(lastName)
                                      ));
        AccountManager.list.add(account);

        return account;
    }

    public static Account find(AccountId id) {
        return AccountManager.list.find(id);
    }

    private static AccountId randomId() {
        StringBuilder builder = new StringBuilder();
        Random rand = new Random();

        for (int count = 0; count < 3; count++) {
            builder.appendCodePoint('a' + rand.nextInt('z' - 'a' + 1));
        }
        for (int count = 0; count < 5; count++) {
            builder.append(rand.nextInt(10));
        }

        return new AccountId(builder.toString());
    }
}
