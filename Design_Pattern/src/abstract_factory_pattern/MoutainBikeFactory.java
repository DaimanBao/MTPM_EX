package abstract_factory_pattern;

public class MoutainBikeFactory implements BikeFactory {
	@Override
	public Wheel geWheel() {
		return new MoutainBikeWheel();
	}
}
