import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        int answer = 0;
        int a = 0, b = 0, input = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.print("Enter value for A : ");
            a = sc.nextInt();
            System.out.print("Enter value for B : ");
            b = sc.nextInt();
            System.out.print("Enter operation : ");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    answer = a + b;
                    System.out.println("the sum of " + a + " and " + b + " is :" + answer);
                    break;
                case 2:
                    answer = a - b;
                    System.out.println("the substraction of " + a + " and " + b + " is :" + answer);
                    break;
                case 3:
                    answer = a * b;
                    System.out.println("the multiplication of " + a + " and " + b + " is :" + answer);
                    break;
                case 4:
                    answer = a / b;
                    System.out.println("the division of " + a + " and " + b + " is :" + answer);
                    break;
                case 5:
                    System.out.println("Exit");
                    flag = false;
                    break;
                default:
                    System.out.println("please try again");
                    break;
            }
        }
    }
}
