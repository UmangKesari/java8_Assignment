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
    static List<Employee> list =new ArrayList<>();

    public static void usingFilter(List<Employee> employeeList){
        employeeList.stream()
                .filter(p -> p.age==23).forEach(System.out::println);
    }


    public static void usingMap(List<Employee> employeeList)
    {
        employeeList.stream().map(p -> p.email).forEach(System.out::println);
    }

    public static void main(String[] args)
    {

        list.add(new Employee("Sunny","Agrawal","sunny009@gmail.com",23));
        list.add(new Employee("Paras","Porwal","parascs@gmail.com",21));
        list.add(new Employee("Sajal","Gupta","sajal4me@gmail.com",22));
        list.add(new Employee("Vikram","Tiwana","vikram@gmail.com",23));
        list.add(new Employee("Umang","Kesari","umang@knoldus.in",23));

        usingFilter(list);
        usingMap(list);
    }
}

