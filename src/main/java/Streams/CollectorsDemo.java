package Streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsDemo
{
    Employee employee = new Employee("Rahul","Pratap","rahul@gmail.com",23);
    public double averagingInteger(Employee[] emp)
    {
        Stream<Employee> empStream = Arrays.stream(emp);
        return empStream.collect(Collectors.averagingInt(Employee::getAge));
    }

    Map<Integer, List<Employee>> usingGroupingBy(Employee[] emp) {
        Stream<Employee> empStream = Arrays.stream(emp);
        return empStream.collect(Collectors.groupingBy(Employee::getAge));
    }

    Optional<Employee> usingMaxBy(Employee[] emp) {
        Stream<Employee> empStream = Arrays.stream(emp);
        return empStream.collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
    }

    List<Employee> usingToList(Employee[] emp) {
        Stream<Employee> empStream = Arrays.stream(emp);
        return empStream.collect(Collectors.toList());
    }

    Map<String,Integer> toMap(Employee[] emp) {
        Stream<Employee> empStream = Arrays.stream(emp);
        return empStream.collect(Collectors.toMap(Employee::toString,Employee::getAge));
    }
}
