package Streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeUtil {
    void GetEmpSalaries(Predicate p, List<Employee> list){
        for (Employee l: list) {
            System.out.println("salary = " + p.test(l));
        }
    }
    void GetEmpNames(Function f, List<Employee> list){
        for (Employee l: list ) {
            System.out.println(f.apply(l));
        }
    }
}
