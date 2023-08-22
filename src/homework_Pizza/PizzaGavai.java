package homework_Pizza;

public class PizzaGavai extends Pizza{
    private static String TYPE ="Gavai";
    public PizzaGavai(){
        super(TYPE);
    }
    protected void prepare(){
        System.out.println("Preparing Pizza Gavai");
    }
}
