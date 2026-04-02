package bridge_pattern;

public class Triangle extends Shape{
	public Triangle(Color color) {
		super(color);
	}
	
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Triangle with color " + color.nameColor());
	}
}
