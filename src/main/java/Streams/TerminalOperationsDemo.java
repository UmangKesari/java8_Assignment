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


}
