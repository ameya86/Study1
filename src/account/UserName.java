package account;

public class UserName {
    private UserNamePart firstName;
    private UserNamePart lastName;

    public UserName(UserNamePart firstName, UserNamePart lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public AccountDTO copyValue(AccountDTO dto) {
        dto.firstname = this.firstName.copyValue();
        dto.lastname = this.lastName.copyValue();
        dto.fullname = dto.firstname + " " + dto.lastname;
        return dto;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof UserName)) {
            return false;
        }

        UserName name2 = (UserName)obj;

        return this.firstName.equals(name2.firstName) &&
                this.lastName.equals(name2.lastName);
    }
}
