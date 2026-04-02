package bridge_pattern;

public class Circle extends Shape{
	public Circle(Color color) {
		super(color);
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Circle with color " + color.nameColor());
	}	
}
