package academy.learnprogramming;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingDateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

        System.out.println(shortFormat.format(date));
        System.out.println(mediumFormat.format(dateTime));

        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd MMMM yyyy - HH:mm");
        System.out.println(myFormat.format(dateTime));
    }
}
