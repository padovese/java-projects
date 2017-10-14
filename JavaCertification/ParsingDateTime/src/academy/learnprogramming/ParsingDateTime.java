package academy.learnprogramming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {
    public static void main(String[] args) {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse("26/04/1991", myFormat);
    }
}
