package homework_22;

public class VipClient extends Client{
    public VipClient(String name, int id) {
        super(name, id);
    }
    public int givDiscount(){
        System.out.println("Уважаемый клиент   " + getName()+ " у вас скидка 10%");
        return 10;
}
}