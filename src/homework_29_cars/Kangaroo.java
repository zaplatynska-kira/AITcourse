package homework_29_cars;

public class Kangaroo implements Movable{
    @Override
    public void move() {
        System.out.println("Kangaroo can run fast jump high");
    }

    @Override
    public void stop() {
        System.out.println("Kangaroo can stop without falling");

    }

    public String toString(){
        return "Kangaroo";
    }

}
