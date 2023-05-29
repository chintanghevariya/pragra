import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DataReader {
    //throws keyword force user to use try
    // throws doesn't throw exception
    //throw does.
    public void ReadData() throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        File f = new File("abc.txt");
        sc = new Scanner(f);
        System.out.println(sc);
        sc.close();
    }
    public void calculate() throws ArithmeticException{
        System.out.println("");
    }
}
