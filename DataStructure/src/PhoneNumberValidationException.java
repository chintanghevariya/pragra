public class PhoneNumberValidationException extends Exception{
    public PhoneNumberValidationException(){
        super("Phone number should have all numbers and should not exceed 10 digit.");
    }
}
