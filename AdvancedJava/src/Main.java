import java.sql.Array;
import java.util.*;
import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        //Anonymous classes -> we will create inline class.

        //void work()
        // sout -> it is a statement.
        //"abc" -> string literal.

        List<String> name1 = Arrays.asList("sam", "harry", "chintan", "kkhushbu","abc");
       // List<String> name2 = List.of("Sam", "harry", "chintan", "kkhushbu"); // java 1.9 or later

        Calc c = (a,b)-> a + b;

        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        // whoever accepts functional interface, we can pass lambda expression

        // int compare(T a1, T a2);
        name1.sort((s1,s2)-> s1.compareTo(s2));
        System.out.println(name1);

        name1.forEach((s)-> System.out.println("Hi " + s + "."));

        doMath((x,y)-> System.out.println("enter 1st para" + x + "enter 2nd para " + y));


//        doMath(c);
//
//        doMath((x,y)->x+y+y);


//        Iwork ii = () -> {int a  = 7;};
//        CalculateArea c = new CalculateArea(){
//            //c -> object of class which implements
//            // CalculateArea interface
//            @Override
//            public Double squareArea(double side, int a){
//                System.out.println("ano");
//                return side * side * 2;
//            }
//        };
//
//        CalculateArea l = (side,a) -> {
//            System.out.println("anon");
//            return side * a * 2;
//        };
//
//        CalInterest i = (pAmount, rate, year) -> (pAmount * rate * year)/100;
//        //test
//        System.out.println("Simple interest : " + i.calculateSimpleInterest(30000.0, 8.5, 7.0));
//        System.out.println("principal amount : ");
//        System.out.println("Square Area"+c.squareArea(5.6,3));
   }

//   static void doMath(Calc c){
//       c.sum(2,6);
//   }

    static void doMath(BiConsumer b){
        b.accept(2,6);
    }
}