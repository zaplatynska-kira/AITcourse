package lesson_65;

public class OurRunnable implements Runnable{
    public void run(){

        System.out.println(Thread.currentThread().getName() + "started");


    }
}
