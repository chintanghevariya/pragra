package Exercise;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Date d1 = new Date(2023,8,25);
        Date d2 = new Date(2023,7,25);
        Employee emp1 = new Employee("ramesh", "Patel", 30, 50000, "Google");
        Employee emp2 = new Employee("suresh", "Vora", 25, 60000, "Apple");
        Employee emp3 = new Employee("mahesh", "shah", 35, 40000, "Microsoft");
        Employee emp4 = new Employee("dinesh", "devani", 28, 35000, "Ola");
        Employee emp5 = new Employee("vinu", "bhalani", 32, 65000, "Uber");

        //Create 2 teams
        Team team1 = new Team("Car Pooling", "Book ride, Cancel Ride", "Patel", 100000, d1);
        Team team2 = new Team("Zomato", "Order food,  Order Groceries", "Ambani", 75000, d2);

        HashMap<Employee, Team> employeeTeamMap = new HashMap<>();
        employeeTeamMap.put(emp1, team1);
        employeeTeamMap.put(emp2, team1);
        employeeTeamMap.put(emp3, team2);
        employeeTeamMap.put(emp4, team2);
        employeeTeamMap.put(emp5, team2);

        employeeTeamMap.forEach((employee, team) ->
                System.out.println(employee.getFirstName() + " is working under " + team.stakeholders
                + " in " + team.projectName + " team"));

        employeeTeamMap.entrySet().removeIf(entry -> entry.getKey().salary < 50000);

        System.out.println("\nafter removal the employee below 50000 salary\n");
        employeeTeamMap.forEach((employee, team) ->
                System.out.println(employee.getFirstName() + " is working under " + team.stakeholders
                        + " in " + team.projectName + " team"));

        // Adding emp with the salary of 50000 or more to set.
        Set<Employee> employeesSet = new HashSet<>();
        for (Map.Entry<Employee, Team> entry : employeeTeamMap.entrySet()) {
            if (entry.getKey().salary >= 50000) {
                employeesSet.add(entry.getKey());
            }
        }

        Iterator<Employee> iterator = employeesSet.iterator();

        System.out.println("\nemp with salary more than 50000\n");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getFirstName());
        }

        List<Employee> employeesList = new ArrayList<>(employeesSet);

        // Remove emp with salary 50000 from the list
        employeesList.removeIf(employee -> employee.salary == 50000);

        System.out.println("\nupdated list after removing with salary of 50,000\n");

        Iterator<Employee> i = employeesList.iterator();
        while(i.hasNext()){
            Employee employee = i.next();
            System.out.println(employee.getFirstName());
        }
    }
}
