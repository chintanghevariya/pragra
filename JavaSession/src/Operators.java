public class Operators {
    public static void main(String[] args) {
        // Operators
        //Arithmetic operators
        // logical operator
        // comparison operator
        // Unary Operators


        int a = 10;
        int b = 3;
        double c = (double) a/(double) b;
        System.out.println(c);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

        // if-else block

        if(a == b){
            System.out.println("a and b are equal.");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else{
            System.out.println("a is less than b");
        }

        int A = 5;
        System.out.println(A++);
        System.out.println(++A);

        System.out.println(A--);
        System.out.println(--A);



    }
}
