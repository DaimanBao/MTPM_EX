package factory_method_pattern;

public class Chocolate extends Candy {
    @Override
    public void prepare() {
        System.out.println("Preparing chocolate candy");
    }

    @Override
    public double getPrice() {
        return 2.5;
    }
}
