import java.time.DayOfWeek;
import java.time.LocalDate;


public class task1 {
    public static void main(String[] args) {

        final int month = 3;
        LocalDate date = LocalDate.of(2019, month, 1);
        int weekOffset = date.getDayOfWeek().getValue() % 7;
        String firstLineOffset = new String(new char[weekOffset]).replace("\0", "    ");
        System.out.print(firstLineOffset);
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            date = date.plusDays(1);
        }
    }
}

