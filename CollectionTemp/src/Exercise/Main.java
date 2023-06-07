package Exercise;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("John", "Smith", 30, 50000, "ABC Company");
        Employee emp2 = new Employee("Jane", "Doe", 25, 60000, "ABC Company");
        Employee emp3 = new Employee("Mic", "Johnson", 35, 40000, "XYZ Company");
        Employee emp4 = new Employee("Em", "Brown", 28, 35000, "XYZ Company");
        Employee emp5 = new Employee("David", "Jones", 32, 65000, "XYZ Company");

        // Create 2 teams
        Team team1 = new Team("Digital Wallet", "Feature 1, Feature 2", "Mark", 100000, new Date());
        Team team2 = new Team("Mobile Banking", "Feature 3, Feature 4", "Laura", 80000, new Date());

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

        System.out.println("after removal the employee below 50000 salary");
        employeeTeamMap.forEach((employee, team) ->
                System.out.println(employee.getFirstName() + " is working under " + team.stakeholders
                        + " in " + team.projectName + " team"));

        Set<Employee> employeesSet = new HashSet<>();
        for (Map.Entry<Employee, Team> entry : employeeTeamMap.entrySet()) {
            if (entry.getKey().salary >= 50000) {
                employeesSet.add(entry.getKey());
            }
        }

        Iterator<Employee> iterator = employeesSet.iterator();

        System.out.println("emp with salary more than 50000");
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee.getFirstName());
        }

        List<Employee> employeesList = new ArrayList<>(employeesSet);

        // Remove employee with salary 50000 from the list
        employeesList.removeIf(employee -> employee.salary == 50000);

        System.out.println("updated list");

        Iterator<Employee> i = employeesList.iterator();
        while(i.hasNext()){
            Employee employee = i.next();
            System.out.println(employee.getFirstName());
        }


    }
}
