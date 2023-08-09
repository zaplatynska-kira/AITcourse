package homework_15_02;

import homework1501.Student;

public class Doctors15 {
    public static void main(String[] args) {
        Doctors doctors = new Doctors(45,"Vatson","pediatrics" );

        doctors.english();
        doctors.experience();
        doctors.consultations();
        System.out.println("Doctor name: " + doctors.name);
        System.out.println("Doctors age: " + doctors.age);
        System.out.println("Doctors profile: " + doctors.profile);
    }
}
