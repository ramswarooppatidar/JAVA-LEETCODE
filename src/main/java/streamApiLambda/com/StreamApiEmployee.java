package streamApiLambda.com;

import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name,
                    String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - " + department + " - " + salary;
    }
}
public class StreamApiEmployee {
    public static void findEmployeeSalaryGraterThen(List<Employee> employees){
        //find the emp[loyee salary rater then 60000;
        List<Employee> result = employees.stream()
                .filter(emp -> emp.getSalary() > 60000)
                .toList();
        System.out.println(result);
    }
    public static void sortEmployeeBySalaryDesc(List<Employee> employees){
        List<Employee> result = employees.stream()
//                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .sorted(Comparator.comparingDouble((Employee emp) -> emp.getSalary()).reversed())
                .toList();
        System.out.println(result);
    }
    public static void findHigestPaidEmploye(List<Employee> list){
        Optional<Employee> employee = list.stream()
                .sorted(Comparator.comparingDouble((Employee emp) -> emp.getSalary()).reversed())
                .limit(1)
                .findFirst();

        employee.ifPresent(emp -> {
            System.out.println("Hoghest paid employee is :"+ emp.getName());
        });
    }
    public static void findHighestPaidEmployee2(List<Employee> employees){
        Employee emp = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary))
                .orElseThrow();
        System.out.println("Highest paid employee is(method 2) :"+ emp.getName());
    }
    public static void secondHighestPaidEmployee(List<Employee> employees){
        Employee empResult = employees.stream()
                .sorted(Comparator.comparingDouble((Employee emp) -> emp.getSalary()).reversed())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println("second highest paid emplyee is :"+empResult.getName()+" :"+empResult.getSalary());

        Double secondHigestSalary = employees.stream()
                .map(emp -> emp.getSalary())
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow();
        System.out.println("second highest salary :"+ secondHigestSalary);
    }
    public static void groupEmployeeByDepartment(List<Employee> employee){
        Map<String, List<Employee>> result = employee.stream()
                .collect(Collectors.groupingBy(
                        (Employee emp) -> emp.getDepartment()
                ));
        System.out.println(result);
        result.entrySet()
                .forEach(entry -> System.out.println(entry.getKey() +" :"+entry.getValue()) );
    }
    public static void countEmployeeInEachDepartment(List<Employee> employees){
        Map<String , Long> result =  employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment
                        ,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
    public static void findAverageSlaryInEachDepartment(List<Employee> emp){
        Map<String, Double> result = emp.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(result);
    }
    public static void findHighestPaidEmployeeInEachDepartment(List<Employee> employee){
        Map<String, Optional<Employee>> result =
                employee.stream()
                        .collect(Collectors.groupingBy(
                                Employee::getDepartment,
                                Collectors.maxBy(
                                        Comparator.comparingDouble(Employee::getSalary)
                                )
                        ));
        result.forEach((dep, emp) ->{
            System.out.println(dep+" :"+emp);
        });
    }
    public static void partitionEmplyeeIntoTwoGroup(List<Employee> employees){
        Map<Boolean, List<Employee>> result =
                employees.stream()
                        .collect(Collectors.partitioningBy(
                                e -> e.getSalary()>=70000
                        ));

        System.out.println("salary >= 70000 "+result.get(true));
        System.out.println("salary < 70000 "+result.get(false));
    }
    public static void mapEmployeeIdWithName(List<Employee> emp){
        Map<Integer, String> result = emp.stream()
                .collect(Collectors.toMap(
                        Employee::getId,
                        Employee::getName
                ));
        System.out.println(result);
    }
    public static void main(String args[]){
        List<Employee> employees = List.of(
                new Employee(1, "Rahul", "IT", 70000),
                new Employee(2, "Amit", "HR", 50000),
                new Employee(3, "Neha", "IT", 90000),
                new Employee(4, "Priya", "Finance", 60000),
                new Employee(5, "Vikas", "HR", 80000),
                new Employee(6, "Ravi", "IT", 60000)
        );
        findEmployeeSalaryGraterThen(employees);
        sortEmployeeBySalaryDesc(employees);
        findHigestPaidEmploye(employees);
        findHighestPaidEmployee2(employees);
        secondHighestPaidEmployee(employees);
        groupEmployeeByDepartment(employees);
        countEmployeeInEachDepartment(employees);
        findAverageSlaryInEachDepartment(employees);
        findHighestPaidEmployeeInEachDepartment(employees);
        partitionEmplyeeIntoTwoGroup(employees);
        mapEmployeeIdWithName(employees);
    }
}
