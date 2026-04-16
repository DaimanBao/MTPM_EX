package decorator_pattern;

public class RedBorderDecorator extends ShapeDecorator {

	public RedBorderDecorator(Shape decoratedShape) {
		// TODO Auto-generated constructor stub
		super(decoratedShape);
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	
	private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
	
}
