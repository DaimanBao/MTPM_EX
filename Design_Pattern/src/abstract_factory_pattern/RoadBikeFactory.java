package abstract_factory_pattern;

public class RoadBikeFactory implements BikeFactory {
	@Override
	public Wheel geWheel() {
		return new RoadBikeWheel();
	}
}
