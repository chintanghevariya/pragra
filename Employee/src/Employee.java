import java.awt.*;

public class Employee {
    String firstName, lastName, company;
    int salary;

    // does not have a return type
    // have same name as class name
    // it construct(create) the object
    // there will be at-least one const. in every class.
    //default constructor
    Employee(String firstName, String lastName, int salary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    Employee(String firstName, String lastName, int salary, String company){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.company = company;
    }

    Employee(String firstName, String lastName){
        this(firstName,lastName,0);
        this.company = "Pragra";
    }

    Employee(String firstName){
        this(firstName, null);
    }
    Employee(){
    }
    String print(){
        return firstName +" "+ lastName+" is working at "+ company + " and getting $" + salary;
    }

}
