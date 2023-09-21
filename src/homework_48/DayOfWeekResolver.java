package homework_48;

import java.util.Scanner;

public  class DayOfWeekResolver {
    public  DayOfWeekResolver(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter day");
        DayOfWeek dayEnum= null;

        String days = scanner.nextLine().toUpperCase();
        try {
            dayEnum=DayOfWeek.valueOf(days);

        } catch (IllegalArgumentException e) {
            dayEnum=DayOfWeek.WRONGDAY;
             System.out.println("You entered an incorrect day");

        }
        switch (dayEnum){
            case SUNDAY:
            case SATURDAY:
                System.out.println("Day of rest");
                break;
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("Workday");
                break;
            default:
            case WRONGDAY:
                System.out.println("You entered an incorrect day");
        }


    }

}
