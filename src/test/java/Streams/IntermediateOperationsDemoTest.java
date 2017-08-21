package Streams;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
public class IntermediateOperationsDemoTest
{
    IntermediateOperationsDemo intermediate = new IntermediateOperationsDemo();
    static List<Employee> list =new ArrayList<>();
    int age =21;
    @BeforeClass
    public static void setUp()
    {
        list.add(new Employee("Sunny","Agrawal","sunny009@gmail.com",23));
        list.add(new Employee("Paras","Porwal","parascs@gmail.com",21));
        list.add(new Employee("Sajal","Gupta","sajal4me@gmail.com",22));
        list.add(new Employee("Vikram","Tiwana","vikram@gmail.com",23));
        list.add(new Employee("Umang","Kesari","umang@knoldus.in",23));
    }
    @Test
    public void testFilter()
    {
        assertEquals(intermediate.usingFilter(list,age),"Paras Porwal");
    }
}
