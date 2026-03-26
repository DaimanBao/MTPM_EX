package adapter_pattern;

public class Client {
	public static void main(String[] args) {
		PriceCalculator carCalculator = new CarCalculatorPrice();
		PriceCalculator trucCalculator = new TruckCalculatorPrice();
		
		UKCarPriceCalculator ukCarPriceCalculator = new UKCarPriceCalculator();
		PriceCalculator ukCarAdapter = new UKCarPriceAdapter(ukCarPriceCalculator);
		
		System.out.println("Car price: " + carCalculator.calculatePrice());
		System.err.println("Truck price: " + trucCalculator.calculatePrice());
		System.out.println("UK car price: " + ukCarAdapter.calculatePrice());
	}
}
