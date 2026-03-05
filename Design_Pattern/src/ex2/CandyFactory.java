package ex2;
//(Factory Pattern)
public class CandyFactory {

    public Candy createCandy(String type) {
        if (type.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        } else if (type.equalsIgnoreCase("lollipop")) {
            return new Lollipop();
        }
        throw new IllegalArgumentException("Unknown candy type");
    }
}
