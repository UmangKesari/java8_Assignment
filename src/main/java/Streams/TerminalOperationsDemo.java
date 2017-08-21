package Streams;
import java.util.*;
import java.util.stream.Stream;

public class TerminalOperationsDemo
{
    public boolean anymatch(List<String> oprList)
    {
        return oprList.stream().anyMatch((str) -> str.startsWith("S"));
    }

    public boolean allMatch(List<String> oprList)
    {
        return oprList.stream().allMatch((str) ->str.startsWith("S"));
    }

    /*public Integer max(List<String> oprList){
        Optional<String> max = oprList.stream().max(Comparator.comparingInt(String::length)).orElse(0);
        return max.ifPresent((str) -> str.length()).orElse(0);
    }*/
    public static void main(String[] args)
    {

        List<String> list = new ArrayList<String>();
        list.add("Sunny");
        list.add("Paras");
        list.add("Shubham");
        list.add("Sajal");
        list.add("Lakshay");
        list.add("Umang");

        TerminalOperationsDemo terminal = new TerminalOperationsDemo();

        System.out.println(terminal.anymatch(list));
        System.out.println(terminal.allMatch(list));


    }

}
