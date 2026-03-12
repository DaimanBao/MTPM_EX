package abstract_factory_pattern;

public class BikeBuilder {
	private BikeFactory factory;

	public BikeBuilder(BikeFactory factory) {
		this.factory = factory;
	}
	
	public void buildBike() {
		Wheel wheel = factory.geWheel();
		wheel.createWheel();
	}
	
}
