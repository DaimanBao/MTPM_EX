package abstract_factory_pattern;

public class MoutainBikeWheel implements Wheel {
	@Override
	public void createWheel() {
		System.out.println("Creating mountain bike wheel");
	}
}
