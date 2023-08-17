package homework_23;

public class Client {
    private String name;
    private int id;
    private Operator operator;
    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
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

    public int givDiscount() {

        System.out.println((" Client   " + getName() + "id:   " + getId()));
        System.out.println(" Dear client, " + getName() + ", you have a discount 10%");
        return 10;
    }


}

