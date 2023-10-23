package lesson_65;

public class OurThread implements Runnable{
    String name;
    public OurThread(String name){
        this.name = name;
    }

    public void run(){
        System.out.println(name + "starting");

        try {
            for( int i = 0; i < 10; i++){
                Thread.sleep(300);
                System.out.println("In " + name +" counter is " + i);
            }

        }
        catch (InterruptedException e){
            System.out.println(name + " is interrupted");
        }
        System.out.println(name + "finishing");
    }
}
