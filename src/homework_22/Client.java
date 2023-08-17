package homework_22;

public class Client {
    private String name;
    private int id;

    public Client (String name,int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString () {
        return name + "" + id;
    }

    public int givDiscount(){
        System.out.println(" Client   " + name + "id:   " + id);
        return 0;
}

}
