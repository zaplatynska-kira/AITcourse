package lesson_22;

public class Car1 {
    public class Car extends Vehicle{

        private int mileage;

        public Car(String model, int yearOfManufacture) {
            super(model, yearOfManufacture);
        }

        public int getMileage() {
            return mileage;
        }

        public void goToRoute(int routeLength) {
            System.out.println("Отправлюсь в поездку по маршруту");
            gas();
        /*
        какой-то код
         */
            breaking();
            mileage += routeLength;
        }
    }
}

