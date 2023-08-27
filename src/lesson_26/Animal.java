package lesson_26;

public abstract class Animal {
    public  abstract void sound(); // абстрактный метод - это метод без тела

    public void move(){
        System.out.println("Every animal can move");
    }
}
