package homework_Pizza;

public class PizzaSalamy extends Pizza {
    private static String TYPE = "Pizza Salamy";
    public PizzaSalamy(){
        super(TYPE);
    }
    protected void prepare(){
        System.out.println("Preparing Pizza Gavai");
    }
}
