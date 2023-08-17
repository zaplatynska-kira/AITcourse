package consultation_17_08;

import java.util.Arrays;

public class Bus {
    private final int id;
    private String number;
    private String color;

    private int capacity;

    private Passenger[] passengers;

    static private int counter; // 0 -> 1 -> 2


    public Bus(String number, String color, int capacity) {
        this.number = number;
        this.color = color;
        this.capacity = capacity;
        this.id = counter++;

        passengers = new Passenger[0];
    }

    public static int getCounter() {
        return counter;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.length == capacity) return false;
        Passenger[] temp = Arrays.copyOf(passengers, passengers.length + 1); //null
        temp[temp.length - 1] = passenger;
        passengers = temp;
        return true;
    }

    public boolean dropPassenger(Passenger passenger) {

        if (passengers.length < 1) return false;
        int indexDeletingPas = searchPassenger(passenger);
        if (indexDeletingPas == -1) return false;

        Passenger[] temp = new Passenger[passengers.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < indexDeletingPas) {
                temp[i] = passengers[i];
            } else {
                temp[i] = passengers[i + 1];
            }
        }
        passengers = temp;
        return true;
    }


    private int searchPassenger(Passenger searchPassenger) {
        System.out.println("Ищу пассажира id:" + searchPassenger.getId() + " " + searchPassenger.getName());
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].getId() == searchPassenger.getId()) {
                System.out.println("Нашел! Ура! " + i);
                return i;
            }
        }
        System.out.println("Не нашел никого");
        return -1;
    }

    public boolean dropLastPassenger() {
        if (passengers.length > 0) {
            passengers = Arrays.copyOf(passengers, passengers.length - 1);
            return true;
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Passenger[] getPassengers() {
        //return passengers;
        return Arrays.copyOf(passengers, passengers.length);

//        Passenger[] temp = new Passenger[passengers.length];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = passengers[i];
//        }
//        return temp;


    }


    public String toString() {
        return "{id:" + id + "; number: " + number + "; passengers: " + (passengers.length == 0 ? "{no passengers on board}" : Arrays.toString(passengers)) + "}";
    }
}
