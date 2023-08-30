package homework_32_test;

public class Rectangle implements Shape {
    int length;
    int width;

    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
    }

    public double perimeter(){
        return  2*(length + width);
    }

    public double area(){
        return length * width;
    }


}
