import java.util.Scanner;

public class doWhile{

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//        do{
//            System.out.println("1 - abc");
//            System.out.println("2 - abc");
//            System.out.println("3 - abc");
//            System.out.println("4 - exit");
//            input = sc.nextInt();
//        }while (input != 4);

        for(int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        for(int i = 5; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        int space, rows = 5, k = 0;
        for (int i = 1; i <= rows; ++i, k = 0) {
            for (space = 1; space <= rows - i; ++space) {
                System.out.print(" ");
            }
            while (k != 2 * i - 1) {
                System.out.print("*");
                ++k;
            }
            System.out.println();
        }
    }
}
