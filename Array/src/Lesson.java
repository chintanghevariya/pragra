import java.util.Scanner;

public class Lesson {

    public static void main(Lesson[] args) {

        int[] orderPrice = new int[10];

//        studentNames[0] = "chintan";
//        studentNames[1] = "nishtha";
//        studentNames[2] = "rutikk";
//        studentNames[3] = "shrey";
//        studentNames[4] = "chintan";
//        studentNames[5] = "nishtha";
//        studentNames[6] = "rutikk";
//        studentNames[7] = "shrey"; dvd

        orderPrice[2] = 5;
        orderPrice[5] = 8;
        orderPrice[6] = 4;
        orderPrice[9] = 9;
        for(int k = 0; k < orderPrice.length; k++){
            System.out.println("value of index : " + k + " is " +orderPrice[k]);
        }

        int i = 0;
        Scanner sc = new Scanner(System.in);
        while(i < orderPrice.length ){
            if(i == 2 || i == 5 || i == 6 || i == 9) {
                System.out.println("Please enter values for index " + i);
                orderPrice[i] = sc.nextInt();
            }
            i++;
        }

        // to print array
        int j = 0;
        while(j < orderPrice.length ){
            if(j == 2 || j == 5 || j == 6 || j == 9) {
                System.out.println("value of index : " + j + " is " + orderPrice[j]);
            }
            j++;
        }

    }
}
