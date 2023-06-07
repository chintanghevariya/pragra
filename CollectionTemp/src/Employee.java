import lombok.Data;
import lombok.Getter;

import java.util.Objects;

@Getter

public final class  Employee {
    private int empID;
    private String firstName, lastName;
    private double salary;
    private String company;
    public Employee(String firstName, String lastName, double salary, String company, int empID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
        this.empID = empID;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", EmpID='" + empID + '\'' +
                '}';
    }
}
