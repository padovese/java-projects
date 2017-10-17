package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class CreatingDateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        LocalDate localDate = LocalDate.of(1991, Month.APRIL, 26);
        LocalTime localTime = LocalTime.of(11,45);

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(LocalDateTime.of(localDate, localTime));
    }
}
