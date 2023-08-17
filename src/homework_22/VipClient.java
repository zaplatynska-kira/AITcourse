package homework_22;

public class VipClient extends Client{
    public VipClient(String name, int id) {
        super(name, id);
    }
    public int givDiscount(){
        System.out.println((" Client   " +getName() + "id:   " + getId()));
        System.out.println(" Dear client, "+ getName()+ ", you have a discount 10%");
        return 10;
}
}