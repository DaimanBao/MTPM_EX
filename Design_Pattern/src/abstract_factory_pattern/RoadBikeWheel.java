package abstract_factory_pattern;

public class RoadBikeWheel implements Wheel {
	@Override
	public void createWheel() {
		System.out.println("Creating road bike wheel");
	}
}
