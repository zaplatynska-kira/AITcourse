package homework_Pizza;

class PizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "Mozarella":
                return new Pizza("Mozarella") {
                    @Override
                    protected void prepare() {
                    }
                };

            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }

    }

}






