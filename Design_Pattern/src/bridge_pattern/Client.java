package bridge_pattern;

public class Client {
	public static void main(String[] args) {
		Shape s1 = new Triangle(new Red());
		Shape s2 = new Circle(new Red());
		
		s1.draw();
		s2.draw();
	}
}
