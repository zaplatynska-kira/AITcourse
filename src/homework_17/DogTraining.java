package homework_17;

public class DogTraining {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Luna", 50);

        for (int i = 0; i < 7; i++) {
            dog1.training();
        }

        System.out.println("jumpHeight " + dog1.jumpHeight);
        System.out.println("maxJumpHeight " + dog1.maxJumpHeight);


        Dog dog = new Dog("Rex", 150);

        System.out.println(dog.jumpHeight);
        System.out.println(dog.maxJumpHeight);


        int[] barriers = {120, 180, 160, 280, 350, 50};
        for (int barrier : barriers) {
            dog.getBarrier(barrier);

            int[] finish = {1,2,3,4,5,6,7,8,9,10};
int count =0;


            for (int i = 0; i < finish.length; i++) {
                dog.jump(finish[i]);
            }
        }
    }
}




