public class AccessControl {
    private final String password;

    public AccessControl(String password) {
        this.password = password;
    }

    public boolean authenticate(String enteredPassword) {
        return password.equals(enteredPassword);
    }
}
