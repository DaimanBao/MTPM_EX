package factory_method_pattern;

public class CandyStore {

    private CandyFactory factory;

    public CandyStore(CandyFactory factory) {
        this.factory = factory;
    }

    public void orderCandy(String type) {
        Candy candy = factory.createCandy(type);
        candy.prepare();
        System.out.println("Price: $" + candy.getPrice());
    }
}
