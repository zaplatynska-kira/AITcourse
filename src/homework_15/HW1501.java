package homework_15;

public class HW1501 {
    public static void main(String[] args) {
        Dog dog = new Dog();


        Dog dog1 = new Dog(5);
        System.out.println(dog1.age);
        System.out.println(dog1.name);

        System.out.println("==================");

        Dog dog2 = new Dog(3, "Vint");
        dog2.sayGav();
        dog2.running();
        System.out.println("Cat name: " + dog2.name);
        System.out.println("Cat age: " + dog2.age);

        System.out.println("===================");

        Dog dog3 = new Dog(5, "Boris", "red");

        dog3.sleep();
        System.out.println("Cat name: " + dog3.name);
        System.out.println("Cat age: " + dog3.age);
        System.out.println("Cat color: " + dog3.color);


    }
}

