package co.pragra.pragracoffeetime.execption;

public class CustomerNotFoundException extends RuntimeException {
    public CustomerNotFoundException(String s) {
        super(s);
    }
}
