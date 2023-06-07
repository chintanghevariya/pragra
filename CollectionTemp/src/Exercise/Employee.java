package Exercise;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    String firstName;
    String lastName;
    int age;
    double salary;
    String company;
}
