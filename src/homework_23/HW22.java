package homework_23;

import homework_22.Client;
import homework_22.VipClient;

public class HW22 {
    public static void main(String[] args) {

        Client client1=new VipClient("Diter",7777777);
        Operator operator= new Operator("Weber", "Marie");
        System.out.println(client1.givDiscount());
        System.out.println(" Operator:  " +  operator.getFirstName() + " " + operator.getLastName() + "");
    }
}
