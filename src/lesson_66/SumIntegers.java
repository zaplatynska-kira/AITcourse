package lesson_66;

public class SumIntegers extends Thread{
    int counter;

    public void run(){
        for( int i = 0; i < 1000; i++){
            counter++;
        }
    }

    public int getCounter() {
        return counter;
    }
}
