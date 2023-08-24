package homework_28;

public class Rectangle implements Shape{

    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
        public double area() {
            return width * height;
        }
        public double perimetr () {
            return 2 * (width + height);
        }

}

