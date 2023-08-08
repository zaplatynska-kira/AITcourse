package homework_15;

public class Dog {
    String name;
    String color;
    int age;

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(int dogAge, String dogName, String dogColor){
        this.age = dogAge;
        this.name = dogName;
        this.color = dogColor;
    }

    public Dog() {
    }

    void sayGav() {
        System.out.println("Gav!!!");
    }

    void sleep() {
        System.out.println("I am sleeping");
    }

    void running() {
        System.out.println("I am running!!");
    }
}

