import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("If else statement example");
//        int a = -2, b = 2;

//        if(a == 0) {
//            System.out.println("a is Zero");
//        }else if (a < 0) {
//            System.out.println("a is negative");
//        } else if(a % 2 == 0){
//            System.out.println("a is Even");
//        } else if (a % 2 == 1) {
//            System.out.println("a is odd");
//        }

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any integer value");
        a = sc.nextInt();
        if(a > 0){
            System.out.println("Value of a is : " + a + " ,is positive value");
        } else if (a > 10 ) {
            System.out.println("Value of a is : " + a + ", is greater than 10" );
        } else if (a < 0) {
            System.out.println("Value of a is : " + a + " is negative");
        } else if (a == 0){
            System.out.println("Value of a is : " + a + " is Zero value");
        }

    }
}
