package homework_22;

public class HW22 {
    public static void main(String[] args) {
        Client client= new Client("Manfred", 1234567);
        System.out.println(client.givDiscount());

        Client client1=new VipClient("Diter",7777777);
        System.out.println(client1.givDiscount());
    }
}
