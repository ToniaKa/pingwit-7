package pl.pingwit.homework_13;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Application {
    public static void main(String[] args) {
        String date = "2023-17-01";
        String date1 = "23-2022-01";
        String date2 = "15-07-2022";

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-dd-MMM");
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy");

        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-dd-MM");
        LocalDate parseDate = LocalDate.parse(date, pattern);
        String parseDateFormatter1 = parseDate.format(dateTimeFormatter);
        String parseDateFormatter2 = parseDate.format(dateTimeFormatter1);
        String parseDateFormatter3 = parseDate.format(dateTimeFormatter2);
        String parseDateFormatter4 = parseDate.format(dateTimeFormatter3);

        DateTimeFormatter pattern1 = DateTimeFormatter.ofPattern("dd-yyyy-MM");
        LocalDate parseDate2 = LocalDate.parse(date1, pattern1);
        String parseDateFormatter5 = parseDate2.format(dateTimeFormatter);
        String parseDateFormatter6 = parseDate2.format(dateTimeFormatter1);
        String parseDateFormatter7 = parseDate2.format(dateTimeFormatter2);
        String parseDateFormatter8 = parseDate2.format(dateTimeFormatter3);

        DateTimeFormatter pattern2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parseDate3 = LocalDate.parse(date2, pattern2);
        String parseDateFormatter9 = parseDate3.format(dateTimeFormatter);
        String parseDateFormatter10 = parseDate3.format(dateTimeFormatter1);
        String parseDateFormatter11 = parseDate3.format(dateTimeFormatter2);
        String parseDateFormatter12 = parseDate3.format(dateTimeFormatter3);

        String[] dates = {parseDateFormatter1, parseDateFormatter2, parseDateFormatter3, parseDateFormatter4, parseDateFormatter5,
                parseDateFormatter6, parseDateFormatter7, parseDateFormatter8, parseDateFormatter9, parseDateFormatter10, parseDateFormatter11, parseDateFormatter12};
        for (String stringDates : dates) {
            System.out.println(stringDates);
        }
        DateTimeFormatter newPattern = DateTimeFormatter.ofPattern("HH/mm/a/EEEE : yyyy-dd-MMMM-G").localizedBy(Locale.ENGLISH);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(newPattern.format(localDateTime));
    }
}
