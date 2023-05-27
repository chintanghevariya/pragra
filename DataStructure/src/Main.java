import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserDetails u1 = new UserDetails();
        User user = u1.getUserData();
        System.out.println(user.toString());
    }
}