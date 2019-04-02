package task11;

import java.time.LocalDate;
import java.time.DayOfWeek;
import static java.time.LocalDate.*;
import static java.lang.System.*;


public class task11 {
    public static void main(String[] args) {

        final int month = 3;
        LocalDate date = of(2019, month, 1);
        int weekOffset = date.getDayOfWeek().getValue() % 7;
        String firstLineOffset = new String(new char[weekOffset]).replace("\0", "    ");
        out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                out.println();
            }
            date = date.plusDays(1);
        }
    }
}
