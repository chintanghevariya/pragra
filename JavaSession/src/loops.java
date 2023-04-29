import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        // for
        // while
        // do-while
        // for-each

        int a = 5;
        while (a < 10){
            a++;
            if(a == 7) {
                continue;
            }
            System.out.println("a : " + a);
        }

        System.out.println("for loop");

        for(int i = 5; i < 10; i++){
            if(i == 7){
                continue;
            }
            System.out.println(i);
        }

//        System.out.print("enter a number to check for prime number : ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int counter = 2;
//        boolean isPrime = true;
//        while(counter <= a-1){
//            if(a%counter == 0){
//                isPrime = false;
//            }
//            counter++;
//        }
//        if(isPrime){
//            System.out.println(a + " is a prime number");
//        }else{
//            System.out.println(a + " is not a prime number");
//        }

//        Scanner sc = new Scanner(System.in);
//        int input = 0;
//        boolean flag = true;
//        String s ="x";


//        while(flag){
//            System.out.println("Enter any value");
//            input = sc.nextInt();
//            System.out.println(input);
//            if(input == 5){
//                flag = false;
//            }
//        }

//        while(!s.equals("Exit")){
//            System.out.println("Enter any string");
//            s = sc.next();
//            System.out.println(s);
//        }




    }
}
