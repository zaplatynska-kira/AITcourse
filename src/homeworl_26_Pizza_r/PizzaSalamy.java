package homeworl_26_Pizza_r;

public class PizzaSalamy extends Pizza {
    private static String TYPE = "Pizza Salami";

    public PizzaSalamy() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with salami and tomatoes");
    }
}

