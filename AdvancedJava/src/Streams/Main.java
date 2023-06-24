package Streams;
import java.util.*;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static  void main(String[] args) {
       // List<String> cars = Arrays.asList("Tesla","BMW","Camry","Kia");
        List<Employee> emp = Arrays.asList(new Employee("Chintan","Ghevariya",100000),
                                            new Employee("tom","gery",2000),
                                            new Employee("er","re",232323));
        EmployeeUtil e1 = new EmployeeUtil();
        Function<Employee,String> f = c->c.getFirstName();
        e1.GetEmpNames(f,emp);
        Predicate<Employee> p = x->x.getSalary()>50000;
        e1.GetEmpSalaries(p,emp);


        //cars.forEach(System.out::println);
        // Implement predicate and function functional interface.
        //predicate :  has a test method, input can be anything, check the condition and return bool
        // function : transform an object, any input object, return any object.

//        CarUtil carUtil = new CarUtil();
//        Predicate<String> p = c-> c.length() >= 4;
//        carUtil.nameCheck(p,cars);
    }
}
