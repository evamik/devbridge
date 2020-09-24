import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SpecialBonusTask2020Fall {
    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        for (int year = fromYear; year < toYear; year++) {
            // assume year format is similar to day and month and has to be 4 digits long
            StringBuilder sb = new StringBuilder(String.format("%04d", year));
            sb.append(new StringBuilder(sb.toString()).reverse());

            LocalDate date = isDateValid(sb.toString());
            if (date != null && sb.toString().equals(sb.reverse().toString()))
                System.out.println(date);
        }
    }

    public static LocalDate isDateValid(String date) {
        try {
            return LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
        } catch (Exception e) {
            return null;
        }
    }
}