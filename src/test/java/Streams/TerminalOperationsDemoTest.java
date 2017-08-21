package Streams;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TerminalOperationsDemoTest
{
    TerminalOperationsDemo  terminalOperationsDemo = new TerminalOperationsDemo();
    static List<String> list = new ArrayList<String>();
    @BeforeClass
    public static void setUp()
    {
        list.add("Sunny");
        list.add("Paras");
        list.add("Shubham");
        list.add("Sajal");
        list.add("Lakshay");
        list.add("Umang");
    }
    @Test
    public void anymatch()
    {
        assertEquals(terminalOperationsDemo.anymatch(list),true);
    }

    @Test
    public void allMatch()
    {
        assertEquals(terminalOperationsDemo.allMatch(list),false);
    }

}
