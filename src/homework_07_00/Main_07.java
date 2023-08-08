package homework_07_00;

import java.util.Random;

public class Main_07 {
    public static void main(String[] args) {
        Random random=new Random();
        int zeit=45;
        int note= random.nextInt(13);
        System.out.println("Note:" +note);

        switch (note) {
            case 12:
            case 11:
            case 10:
                System.out.println("Sehr gut!"+ zeit+ "+"+ "60 min");
                break;
            case 9:
            case 8:
            case 7:
                System.out.println("Super!"+ zeit+ "+"+ "45 min");
                break;
            case 6:
            case 5:
            case 4:
                System.out.println("Gut!"+ zeit + "+"+ "15 min");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("Nicht gut!"+ zeit + "-"+ "30 min");
                break;
            default:
                System.out.println("false");
               break;

        }
    }
}
