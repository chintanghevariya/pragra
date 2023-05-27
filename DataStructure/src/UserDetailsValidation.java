import java.util.Scanner;

public class UserDetailsValidation {
    String firstName, lastName, password, postalCode, email, phoneNumber;
    public void validateFirstName(Scanner sc) throws NameValidationException{
        System.out.println("Enter first name:");
       firstName = sc.nextLine();
        while(firstName.length() > 10) {
            System.out.println("Enter firstname which has less than 10 char");
            firstName = sc.nextLine();
        }
        if (firstName.length() > 10) {
            throw new NameValidationException();
        }
    }

    public void validateLastName(Scanner sc) throws NameValidationException{
        System.out.println("Enter last name :");
        lastName = sc.nextLine();
        while(lastName.length() > 10) {
            System.out.println("Enter last name which has less than 10 char");
            lastName = sc.nextLine();
        }
        if(lastName.length() > 10){
            throw new NameValidationException();
        }
    }

    public void validateEmail(Scanner sc) throws EmailValidationException {
        System.out.println("Enter your email :");
        email = sc.nextLine();
        while(!email.contains("@")){
            System.out.println("Enter the correct email address !");
            email = sc.nextLine();
        }
        if(!email.contains("@")){
            throw new EmailValidationException();
        }
    }

    public void validatePhoneNumber(Scanner sc) throws PhoneNumberValidationException{
        System.out.println("Enter your phone number");
        while (!sc.hasNextInt()) {
            System.out.println("***Please give integer input.***");
            phoneNumber = sc.nextLine();
        }
        phoneNumber = sc.nextLine();
        if (!phoneNumber.matches("\\d+") || phoneNumber.length() > 10){
            throw new PhoneNumberValidationException();
        }
    }

    public void validatePostalCode(Scanner sc) throws PostalCodeValidationException{
        System.out.println("Enter your postal code");
        postalCode = sc.nextLine();
        while(postalCode.length() != 6 || postalCode.matches("^[a-zA-Z]*$")){
            System.out.println("Enter correct postal code");
            postalCode = sc.nextLine();
        }
        if (postalCode.length() != 6 || postalCode.matches("^[a-zA-Z]*$")) {
            throw new PostalCodeValidationException();
        }
    }

    public void validatePassword(Scanner sc) throws PasswordValidationException{
        System.out.println("Enter your password :");
        password = sc.nextLine();
        while(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")){
            System.out.println("Enter the password which must contains atleast one digit [0-9] \n one lowercase [a-z]" +
                    " one uppercase [A-Z], one special character [@!#$%]{}] and must be between 8-20");
            password = sc.nextLine();
        }
        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$")){
            throw new PasswordValidationException();
        }
    }
}
