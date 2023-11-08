package lesson_68;

public class Score {
    String name;
    long time;

    public Score(String name, long time) {
        this.name = name;
        this.time = time;
    }

    public String toString(){
        return name + " ran the distance for " + time + " milliseconds\n";
    }
}
