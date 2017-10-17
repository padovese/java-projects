package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class UsingDateAndTime {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2017, Month.APRIL, 26);
        localDate = localDate.plusDays(-1).plusYears(3).minusDays(-1);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.of(11,45);
        localTime = localTime.minusHours(3).plusMinutes(15);
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.of(2000, 1, 25, 11, 45);
        localDateTime = localDateTime.minusYears(9).plusDays(1).plusHours(5);
        System.out.println(localDateTime);

    }
}
