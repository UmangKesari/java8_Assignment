package Streams;

import java.util.ArrayList;
import java.util.List;

class Employee {
     String firstName;
     String lastName;
     String email;
     int age;

    public Employee(String firstName, String lastName,
                    String email, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
    }

    public String toString(){
        return this.firstName + " " +this.lastName;
    }
}
public class IntermediateOperationsDemo
{
    public static void usingFilter(List<Employee> employeeList, int age)
    {
        employeeList.stream()
                .filter(p -> p.age==23).forEach(System.out::println);
    }

    public static void usingMap(List<Employee> employeeList)
    {
        employeeList.stream().map(p -> p.email).forEach(System.out::println);
    }

}

