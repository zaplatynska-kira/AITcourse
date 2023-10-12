package homework_62;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*
        Получить и вывести на экран:
-текущую дату
-текущий год, месяц и день

Создать дату , например день рождения и вывести на экран

Создать две даты и проверить на равенство

Получить и вывести на экран текущее время

текущее время + 3 часа

Создать дату на неделю позже сегодняшней

Создать дату, которая была на год раньше сегодняшней используя метод minus

Создать дату на год позже сегодняшней используя plus метод

Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

Написать метод, принимающий лист из нескольких дат типа LocalDate и возвращающий количество дней между самой ранней и поздней датами
         */
;
        LocalDate localDate = LocalDate.now();
        System.out.println("Data now is " + localDate);

        LocalDate localDateMonthYear = LocalDate.of(2023, Month.OCTOBER,12);
        System.out.println("Data  is " + localDateMonthYear);

        LocalDate  birthDay= LocalDate.of(1975, Month.AUGUST,25);
        System.out.println("My birthDay " + birthDay);

      LocalDate date1=LocalDate.of(2023,Month.OCTOBER,12);
        LocalDate date2=LocalDate.of(2023,Month.SEPTEMBER, 1);
        boolean dataEqual= date1.isEqual(date2);
        if (dataEqual){
            System.out.println("data1 equal data2");
        } else
        System.out.println("The dates are not equal");

        LocalTime localTime = LocalTime.now();
        System.out.println("Time now is "+localTime);

        LocalTime localTimePlus = LocalTime.now();
        System.out.println("Adding hours: " + localTimePlus.plusHours(3));

        LocalDate newDateWeeks = localDate.plusWeeks(1);
        System.out.println(newDateWeeks);

        LocalDate newDateYears = localDate.plusYears(1);
        System.out.println(newDateYears);

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        LocalDate yesterday = today.minusDays(1);
        System.out.println(" Tomorrow after today's date?" + tomorrow.isAfter(today));
        System.out.println(" Yesterday before today's date?" + yesterday.isBefore(today));


        System.out.println("****************************************************");

    DaysDifferens daysDifferens= new DaysDifferens();
        List<LocalDate> dates = List.of(
                LocalDate.of(2023, 1, 1),
                LocalDate.of(2023, 1, 5),
                LocalDate.of(2023, 1, 10)
        );
        System.out.println(DaysDifferens.returnDate(dates));


    }



}



