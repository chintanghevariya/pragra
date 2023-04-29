import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Employee emp1 = new Employee("chintan","ghevariya",100000, "Amazon");
//        Employee emp2 = new Employee("rutik","patel");
//        Employee emp3 = new Employee();
//        Employee emp4 = new Employee("chintan");

//        System.out.println(emp1.print());
//        System.out.println(emp2.print());
//        System.out.println(emp3.print());
//        System.out.println(emp4.print());

        int option = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select one of the following option :");
        System.out.println("1. BMW \n2. Honda \n3.Toyota ");
        option = sc.nextInt();

        switch(option){
            case 1:
                BMW b1 = new BMW("X9",2023);
                System.out.println(b1.drive());
                break;
            case 2:
                Honda h1 = new Honda("CRV",2023);
                System.out.println(h1.drive());
                break;
            case 3:
                Toyota t1 = new Toyota("HighLander",2022);
                System.out.println(t1.drive());
                break;
            default:
                System.out.println("Please select correct options.");
        }
    }
}