package homework_29_cars;

public  abstract class Car implements Movable {
    private String model;
    private String manufacturer;
    private int year;
    private String colour;

    public Car(String model, String manufacturer, int year, String color) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.colour = color;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return colour;
    }

    public String toString() {
        return "Car{" + "model='" + model + '\'' + ", manufacturer='" + manufacturer + '\'' + ", year=" + year + ", colour='" + colour + '\'' + '}';
    }
}




