package homework_28;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 7);
        Shape circle = new Circle(5);

            System.out.println("Rectangle: " );
            System.out.println("Area: "+ rectangle.area());
            System.out.println("Perimetr: "+ rectangle.perimetr());
        System.out.println("Circle: " );
        System.out.println("Area: "+ circle.area());
        System.out.println("Perimetr: "+ circle.perimetr());
        double totalArea= rectangle.area()+circle.area();
        System.out.println("Total area:  " + totalArea);
        }

}



