package practica13_10_23;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
public class Main {
    public static void main(String[] args) {

        List<String> dates = List.of("13 Oct 2023", "14 Oct 2023", "15 Nov 2023");

        List<String> formattedDates = returnData(dates);

        formattedDates.forEach(System.out::println);
    }

    public static List<String> returnData(List<String> dates) {
        DateTimeFormatter oldDate = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.ENGLISH);
        DateTimeFormatter newDate = DateTimeFormatter.ofPattern("E, dd MMM yyyy",Locale.ENGLISH);

        List<String> formattedDates = dates.stream()
                .map(d -> LocalDate.parse(d, oldDate))
                .sorted()
                .map(d -> d.format(newDate))
                .collect(Collectors.toList());

        return formattedDates;
    }
    }


