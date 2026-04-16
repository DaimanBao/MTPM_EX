package decorator_pattern;

public class Canvas {
	public static void main(String[] args) {
		Shape circle = (Shape) new Circle();
		Shape redBorderCircle = new RedBorderDecorator(circle);
		
		System.out.println("Normal Circle:");
        circle.draw();

        System.out.println("\nCircle with Red Border:");
        redBorderCircle.draw();
	}
}
