package homework_28;

public class Circle implements Shape {
    private double radius;
    private static final double PI = 3.1415;
    public Circle ( double radius){
        this.radius=radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimetr() {
        return 2 * PI * radius;
    }
}
