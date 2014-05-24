package account;

public class AccountFactory {
    public static Account create(String id, String firstName, String lastName) {
        return new Account(new AccountId(id),
                           new UserName(
                               new UserNamePart(firstName),
                               new UserNamePart(lastName)
        		           ));
    }
}
