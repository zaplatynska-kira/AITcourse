package homework_62;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;

public class DaysDifferens {
    /*
    Написать метод, принимающий лист из нескольких дат типа
    LocalDate и возвращающий количество дней между самой ранней и поздней датами
     */
    public static int returnDate(List<LocalDate> localDates) {
        LocalDate earliestDate = Collections.min(localDates);
        LocalDate latestDate = Collections.max(localDates);
        int daysDifference = (int) ChronoUnit.DAYS.between(earliestDate, latestDate);
        return daysDifference;
    }
}
