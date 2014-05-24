package account;

public class UserName {
    private UserNamePart firstName;
    private UserNamePart lastName;

    public UserName(UserNamePart firstName, UserNamePart lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AccountDTO copyValue(AccountDTO dto) {
        dto.firstName = this.firstName.copyValue();
        dto.lastName = this.lastName.copyValue();
        return dto;
    }
}
