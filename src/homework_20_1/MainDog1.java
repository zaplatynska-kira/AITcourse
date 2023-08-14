package homework_20_1;


public class MainDog1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Luna");
        Dog dog2 = new Dog("Rex");

        System.out.println("Всего прыжков " + Dog.getTotalJumps());
        Dog.showStaticJumps();

    }
}
