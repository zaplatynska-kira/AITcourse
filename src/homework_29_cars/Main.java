package homework_29_cars;

public class Main {

    public static void main(String[] args) {
      /*
        1. Создать класс Car, содержащий общие характеристики машин:
    model, manufacturer, year, colour
   2. Создать дочерние классы PassengerCar  и Truck, расширяющие Car
   3. Создать интерфейс Movable, содержащий методы move  и stop
   3. Также создать класс Kangaroo
   4. Общее поведение классов должно характеризоваться методами move  и stop
   5.   Класс Truck должен иметь также свои дополнительные характеристики и поведение, важное для грузовика,
    а именно: макс. грузоподьемность, обьем топливного бака. Поведение грузовика:
    - должен уметь загружаться (load)  и при этом сообщать если превышена его грузоподьемность, а также сообщать
        сколько еще можно загрузить груза
    - должен уметь разгружаться и при этом сообщать в случае если пытаются разгрузить больше чем его имеющийся груз
        или число отрицательное а также сообщать о весе остающегося на борту груза
    - в случае отсутствия топлива или отсутствия груза на борту сообщать о невозможности ехать
    - уметь дозаправляться.
       */
        Movable kangaroo = new Kangaroo();
        System.out.println("Kangaroo:  "+ kangaroo.toString());
        kangaroo.move();
        kangaroo.stop();
        System.out.println();
        Car passengerCar = new PassengerCar("XC90", "Volvo", 2020, "Red");
        System.out.println("PassengerCar:   "+ passengerCar.toString());
        passengerCar.move();
        passengerCar.stop();
        System.out.println();
        Truck truck = new Truck("FH", "Volvo", 2011, "Yelow", 12009, +600);
        System.out.println("Truck: "+ truck.toString());
        truck.setCurrentFuel(300);
        truck.load(10000);
        truck.move();
        truck.unload(5000);
        truck.move();
        truck.stop();



    }
}
