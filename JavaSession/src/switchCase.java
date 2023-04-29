import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        System.out.println("Switch Case Example");

        // Retrive Passwords examples;

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter username : ");
        String userName = sc.next();

        switch (userName){
            case "Tom123":
                System.out.println("password is : TomPassword123");
                break;
            case "Sam123":
                System.out.println("password is : SamPassword123");
                break;
            case "Chintan123":
                System.out.println("password is : ChintanPassword123");
                break;
            default:
                System.out.println("Username you entered is not found : plz try again");
                break;
        }
    }
}
