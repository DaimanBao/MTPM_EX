package factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        CandyFactory factory = new CandyFactory();
        CandyStore store = new CandyStore(factory);

        store.orderCandy("chocolate");
        store.orderCandy("lollipop");
    }
}
