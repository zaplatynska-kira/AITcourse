package homework_20;

public class Dog {


    private String name;
    static private int jumps;
    static private int totalJumps;

    public Dog(String name) {
        this.name = name;
        jumps++;
        totalJumps++;
    }

    public String getName() {
        return name;
    }

    public static int getJumps() {
        return jumps;
    }

    public static int getTotalJumps() {
        return totalJumps;
    }

    static void showStaticJumps() {

    }

    void jump(int numbers) {
        System.out.println(" Прыжки" + numbers);
    }

}




