package homework_15_02;

public class Doctors {
    String name;
    String profile;
    int age;


    public Doctors(int age, String name, String profile) {
        this.age = age;
        this.name = name;
        this.profile = profile;
    }

    public Doctors() {
    }

    void english() {
        System.out.println("I speak english and german ");
    }

    void experience() {
        System.out.println(" my work experience is 15 years ");
    }

    void consultations() {
        System.out.println(" pediatric consultation ");

    }
}
