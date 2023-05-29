import java.util.Scanner;

public class UserDetails{
    Scanner sc = new Scanner(System.in);
    UserDetailsValidation u1 = new UserDetailsValidation();
    public User getUserData(){
        try{
            u1.validateFirstName(sc);
            u1.validateLastName(sc);
            u1.validateEmail(sc);
            u1.validatePhoneNumber(sc);
            u1.validatePostalCode(sc);
            u1.validatePassword(sc);
        }catch (Exception e){
            e.getMessage();
        }finally {
            User user = new User(u1.firstName, u1.lastName, u1.email, u1.phoneNumber, u1.postalCode, u1.password);
            System.out.println("closing...");
            return user;
        }
    }
}

