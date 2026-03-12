package factory_method_pattern;

public class Lollipop extends Candy {
    @Override
    public void prepare() {
        System.out.println("Preparing lollipop candy");
    }

    @Override
    public double getPrice() {
        return 1.5;
    }
}
