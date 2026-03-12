package abstract_factory_pattern;

public class Main {
	public static void main(String[] args) {
		
		BikeFactory mountainBikeFactory = new MoutainBikeFactory();
		BikeBuilder mountainBuilder = new BikeBuilder(mountainBikeFactory);
		mountainBuilder.buildBike();
		
		BikeFactory roadBikeFactory = new RoadBikeFactory();
		BikeBuilder roadBikeBuilder = new BikeBuilder(roadBikeFactory);
		roadBikeBuilder.buildBike();
	}
}
