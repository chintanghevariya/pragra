import java.util.Scanner;

public class exerises {
    public static void main(String[] args) {
        int a = 50;
        int b = 70;

        System.out.println("a = " + a + " b = " + b);

        // using bitwise swap values
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a = " + a + " b = " + b);


        // find largest number using ternary operator ( 3 numbers )
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int value for X, Y and Z");
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int max = (x > y) ? ((x > z) ? x : z) : ((y > z) ? y : z);
        System.out.println("Maximum number out of 3 given number is : " + max);

        //find the smallest using ternary operator

        int min = (x < y) ? ((x < z) ? x : z) : ((y < z ? y : z));
        System.out.println("Minimun number out of 3 given number is : " + min);

        //find factorial number
        long fact = 1;
        int num = 5;
        for(int i = 1; i <= num; i++){
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is :" + fact);
    }
}
