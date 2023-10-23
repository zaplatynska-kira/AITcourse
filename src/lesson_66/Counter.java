package lesson_66;
import java.util.concurrent.atomic.AtomicInteger;
public class Counter {
    private AtomicInteger count = new AtomicInteger(0);

    public void increment(){
        count.getAndIncrement();
    }

    public int value(){
        return count.get();
    }
}
