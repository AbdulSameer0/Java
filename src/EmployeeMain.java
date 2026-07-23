import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

    static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1,"Sameer",10000,"it cell"),
                new Employee(2,"arbaj",12000,"it"),
                new Employee(3,"Shabaj",60000,"it cell"),
                new Employee(4,"Shamim",15000,"it"),
                new Employee(5,"aftab",14000,"research"),
                new Employee(6,"gulam",16000,"developer"),
                new Employee(7,"gulam 2.0",17000,"developer"),
                new Employee(8,"abdul",70000,"research")
        );


        Map<String, Optional<Employee>> findHighestSalary =

                employees.stream()
                        .collect(Collectors.groupingBy(Employee::getDepartment,
                                Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        findHighestSalary.forEach((dept,emp) ->
                System.out.println(dept+" "+emp.get().getName()+"---"+emp.get().getDepartment()+" "+emp.get().getSalary()));
    }
}
