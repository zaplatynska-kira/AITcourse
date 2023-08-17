package consultation_17_08;

import java.util.Arrays;

public class MainBus {
    public static void main(String[] args) {
        Bus bus = new Bus("AA45-67", "red", 3);
        System.out.println(bus.toString());
        System.out.println(bus.dropLastPassenger());

        Passenger passenger = new Passenger("John", "male");

        Passenger passenger1 = new Passenger("Anna", "female");
        Passenger passenger2 = new Passenger("Olivia", "female");
        Passenger passenger3 = new Passenger("Alex", "male");
        System.out.println(passenger.toString());

        bus.addPassenger(passenger);
        bus.addPassenger(passenger1);
        System.out.println(bus.addPassenger(passenger2));
        System.out.println(bus.addPassenger(passenger3));

        System.out.println(bus.toString());

        System.out.println();
        System.out.println("===========DELETE ==========");
        System.out.println(bus.dropPassenger(passenger3));
        System.out.println(bus.dropPassenger(passenger));
        System.out.println(bus.toString());

        String str = "John";
        String str1 = new String("John");
        String str2 = "John";

        System.out.println(str);
        System.out.println(str1);


        System.out.println(str.equals(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("John"));
        System.out.println(str2.equals("John"));


        System.out.println(Passenger.getCounter());

        Passenger[] passArray = bus.getPassengers();
        passArray[0] = passenger3;
        passArray[1].setName("Frida");
        System.out.println(Arrays.toString(passArray));
        System.out.println(bus.toString());


        final Passenger passFinal = new Passenger("fff", "ff");
        passFinal.setName("DDDD");
        passFinal.setKind(true);
        System.out.println(passFinal);
        // passFinal = new Passenger("fder", "erre"); // не допустимо


//        System.out.println(passenger.equals(passenger1));
    }
}
