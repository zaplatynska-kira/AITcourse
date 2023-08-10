package lesson17_test;

public class DogTest {
    String name;
    int jumpHeight;
    int maxjumpHeight;

    public DogTest(String dogName, int jumpHeight, int maxjumpHeight) {
        this.name = dogName;
        this.jumpHeight = jumpHeight;
        this.maxjumpHeight= maxjumpHeight * 2;
    }

    void myName() {
        System.out.println("Меня зовут  " + name + "мой прыжок  " + jumpHeight+ "см");
    }

    void training() {
        if (jumpHeight + 10 <= maxjumpHeight) {
            jumpHeight += 10;
            System.out.println("Я потренировался и мой прыжок уже " + jumpHeight);
            myName();
        } else {
            System.out.println("Больше треннироваться не могу");
        }
    }
}








