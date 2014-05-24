package account;

public class UserNamePart {
    private String name;

    public UserNamePart(String name) {
        this.name = name;
    }

    public String copyValue() {
        return this.name;
    }
}
