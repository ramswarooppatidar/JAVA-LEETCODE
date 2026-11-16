package streamApiLambda.com.moreEmployee;
import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;

    String name;

    int age;

    String gender;

    String department;

    int yearOfJoining;

    double salary;

    public Employee(int id, String name, int age, String gender, String department, int yearOfJoining, double salary)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
    }

    public String getDepartment()
    {
        return department;
    }

    public int getYearOfJoining()
    {
        return yearOfJoining;
    }

    public double getSalary()
    {
        return salary;
    }

    @Override
    public String toString()
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}
public class StreamAPIProblems {
    public static void main(String args[]){
        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(111, "Jennifer", 22, "Female", "HR", 2017, 55000.0));
        employeeList.add(new Employee(112, "Rohit", 35, "Male", "Sales And Marketing", 2019, 23500.0));
        employeeList.add(new Employee(113, "Shubman", 29, "Male", "Infrastructure", 2019, 28000.0));
        employeeList.add(new Employee(114, "Rinku", 28, "Male", "Product Development", 2020, 62500.0));
        employeeList.add(new Employee(115, "Aaditi", 41, "Female", "HR", 2022, 29700.0));
        employeeList.add(new Employee(116, "Mahendra", 43, "Male", "Security And Transport", 2023, 20500.0));
        employeeList.add(new Employee(117, "Nitish", 35, "Male", "Account And Finance", 2019, 37000.0));
        employeeList.add(new Employee(118, "Aditya", 31, "Male", "Product Development", 2019, 34500.0));
        employeeList.add(new Employee(119, "Monika", 24, "Female", "Sales And Marketing", 2021, 21500.0));
        employeeList.add(new Employee(120, "Aman", 38, "Male", "Security And Transport", 2021, 31000.5));
        employeeList.add(new Employee(121, "Sangeeta", 27, "Female", "Infrastructure", 2021, 35000.0));
        employeeList.add(new Employee(122, "Joshi", 25, "Male", "Product Development", 2020, 29000.0));
        employeeList.add(new Employee(123, "Jeddy", 27, "Female", "Account And Finance", 2020, 29000.0));
        employeeList.add(new Employee(124, "Niden", 24, "Male", "Sales And Marketing", 2020, 30200.5));
        employeeList.add(new Employee(125, "Saig", 23, "Male", "Infrastructure", 2019, 7842700.0));
        employeeList.add(new Employee(126, "Saey", 26, "Female", "Product Development", 2018, 3908900.0));
        employeeList.add(new Employee(127, "Shreyas", 25, "Male", "Product Development", 2018, 35700.0));

        //1 How many employees are there in the organization?
       Long total = employeeList.stream().count();
       System.out.println("count using count :"+total);

       Long count1 = employeeList.stream().collect(Collectors.counting());
        System.out.println("count using collertors :"+total);

        //2. Sort the List of Employee objects based on salary in Ascending order
       List<Employee> emp = employeeList.stream()
                .sorted((e1, e2) ->(int) (e1.getSalary() - e2.getSalary()))
                .collect(Collectors.toList());
        System.out.println("sort employee by slary :"+emp);

        List<Employee> emp2 = employeeList.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .collect(Collectors.toList());

//        3. Sort the List of Employee objects based on salary in Descending order
        List<Employee> empDesc = employeeList.stream()
                .sorted((e1, e2) -> (int)(e2.salary - e1.salary))
                .toList();

        Map<String, Long> maleFemale = employeeList.stream()
                                        .collect(
                                            Collectors.groupingBy(Employee::getGender,
                                             Collectors.counting()));
        System.out.println("No of male & female Employees : "+maleFemale);

        //5. How many employees are there in each department?
        Map<String, Long> empInEachDepart = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        System.out.println(" : "+empInEachDepart);

        //6. Get the name of all the department
        List<String> depName = employeeList.stream()
                .map(Employee::getDepartment).distinct().toList();
        System.out.println("Department "+depName);

        //7. Find the average salary of the male and female employee
        Map<String, Double> avgSalaryMaleFemale =
                employeeList.stream()
                        .collect(Collectors.groupingBy(Employee::getGender,
                                Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("avgSalary MAN , FEMAL"+avgSalaryMaleFemale);

        //8. Fetch the highest-paid male and female employee
        Map<String, Optional<Employee>> highestPaidMaleFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
        System.out.println("highest-paid male and female employee : "+highestPaidMaleFemale);

        Map<String, Optional<Employee>> highestPaidMaleFemale2 = employeeList.stream()
                .collect(Collectors.groupingBy((Employee e) -> e.getGender(),
                       Collectors.maxBy(Comparator.comparingDouble((Employee e)-> e.getSalary()))));
        System.out.println("highest-paid male and female employee2 : "+highestPaidMaleFemale2);

        Map<String, Optional<Employee>> highestPaidMaleFemale3 = employeeList.stream()
                .collect(Collectors.groupingBy((Employee e) -> e.getGender(),
                        Collectors.maxBy((e1, e2) -> (int)(e1.getSalary() - e2.getSalary())) ) );


        //9. Fetch the lowest-paid male and female employee
        Map<String, Optional<Employee>> lowestPaidMaleFemale = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.minBy(Comparator.comparingDouble(Employee::getSalary))));


        //10. Get the highest-paid employee in each department
        Map<String, Optional<Employee>> highestPaidEmployeeInEachDepartment = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
    }
}
