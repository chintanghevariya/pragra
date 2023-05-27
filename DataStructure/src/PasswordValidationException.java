public class PasswordValidationException extends Exception {
    public PasswordValidationException()
    {
        super("Password doesn't match the requirements.");
    }
}
