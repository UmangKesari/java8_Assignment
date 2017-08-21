package DateAndTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/*
class DifferenceAge
{
    int years, months, days;
//Period period;

    public DifferenceAge(int years, int months, int days) {
        this.years = years;
        this.months = months;
        this.days = days;
    }
}*/

public class ExactAge
{
    /*
    public Period getPeriod(LocalDate dob,LocalDate current)
    {
       return Period.between(dob,current);
    }

    public int getYear(LocalDate dob,LocalDate current)
    {
        return getPeriod(dob,current).getYears();
    }

    public int getMonth(LocalDate dob,LocalDate current){

        return getPeriod(dob, current).getMonths();
    }

    public int getDay(LocalDate dob,LocalDate current)
    {
        return getPeriod(dob, current).getDays();
    }*/


    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter dob");
        int years= sc.nextInt();
        int months = sc.nextInt();
        int days = sc.nextInt();
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(years, months, days);

        Period period = Period.between(birthday,today);
        System.out.println(period.getYears() +"years " + period.getMonths() +"months " + period.getDays() + "days");
    }
}
