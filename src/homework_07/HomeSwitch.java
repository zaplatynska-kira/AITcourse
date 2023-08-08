package homework_07;


import java.util.Random;

public class HomeSwitch {
    public static void main(String[] args) {


       Random random = new Random();
        System.out.println("Input day");
       int day= random.nextInt(7);
        System.out.println(day);

        System.out.println("days of the week");
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
            default:
                System.out.println("not true");
                break;

        }

    }
}
