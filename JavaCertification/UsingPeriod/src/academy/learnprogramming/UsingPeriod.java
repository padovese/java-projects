package academy.learnprogramming;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UsingPeriod {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        System.out.println(start.toEpochDay());

        Period period = Period.ofWeeks(1);

        System.out.println(start.plus(period));
    }


}
