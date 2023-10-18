package homework_66;

public class Main {
    /*
    Сотрудники банка выдают кредиты. У каждого есть диапазон по времени - максимальное время и минимальное время которое
    требуется сотруднику для выдачи кредита. ( minTime, maxTime) . Но среди них есть сотрудник/сотрудники, у которых
    вдруг возрастает работоспособность и они начинают выдавать кредиты быстрее, а затем опять скорость может снижатьс до
    обычной.
    Посчитать время, за которое каждый сотрудник выдаст N  кредитов

    1. создать классы:
    -   абстрактный класс AbstractClerk
    -   дочерние классы RegularClerk, LazyInspiredClerk
    2. Должна быть возможность на основе классов создавать потоки. Т.е. родительский класс  должен реализовывать Runnable
     */
    public static void main(String[] args) {
        RegularClark regularClark1 = new RegularClark("Ann", 30, 60, 1);
        RegularClark regularClark2 = new RegularClark("Marry", 30, 60, 1);
        LazyInspiredClerk lazyInspiredClerk1 = new LazyInspiredClerk("John", 30, 60, 2, 1);
        LazyInspiredClerk lazyInspiredClerk2 = new LazyInspiredClerk("Anri", 30, 60, 3, 2);
        Thread regularThread1 = new Thread(regularClark1);

        Thread regularThread2 = new Thread(regularClark2);
        Thread inspiredThread1 = new Thread(lazyInspiredClerk1);
        Thread inspiredThread2 = new Thread(lazyInspiredClerk2);

        regularThread1.start();
        inspiredThread1.start();

        regularThread2.start();
        inspiredThread2.start();

    }
}
