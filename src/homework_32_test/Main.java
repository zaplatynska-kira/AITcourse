package homework_32_test;

public class Main {

     /*
    Задача1
Создать интерфейс Shape,содержащиq методы для подсчета площади и периметра фигуры и
классы прямоугольник
и круг, реализующие этот интерфейс.

В методе main создать несколько фигур и вывести на печать площадь и периметр каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов, т.е.
если площадь прямоугольника = 100, круга = 50, то общая площадь 150
     */

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        System.out.println("Circle perimeter = " + circle.perimeter());
        System.out.println("Circle area = " + circle.area());

        Shape rectangle = new Rectangle(10,10);
        System.out.println("Rectangle perimeter = " + rectangle.perimeter());
        System.out.println("Rectangle area = " + rectangle.area());

        Shape[] shapes = {circle,rectangle};

        ShapeCalculator shapeCalculator = new ShapeCalculator();
        System.out.println(shapeCalculator.totalSquare(shapes));
    }

    }

