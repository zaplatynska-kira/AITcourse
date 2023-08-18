package homework_24;

public class Main24_t {
    public static void main(String[] args) {
        Human human=new Human();
        Sportsman sportsman = new Sportsman();
        SportsmanProfi sportsmanProfi = new SportsmanProfi();

        human.run();;
        human.rest();
        sportsman.run();
        sportsman.rest();
        sportsmanProfi.run();
        sportsmanProfi.rest();
        }

    }

