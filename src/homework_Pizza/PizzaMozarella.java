package homework_Pizza;

public class PizzaMozarella extends Pizza{
    private static String TYPE = "Pizza Mozarella";

    public PizzaMozarella(){
        super(TYPE);
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static void setTYPE(String TYPE) {
        PizzaMozarella.TYPE = TYPE;
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing Pizza with mozarella cheese");
    }
}

