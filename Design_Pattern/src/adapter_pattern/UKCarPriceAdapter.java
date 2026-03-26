package adapter_pattern;

public class UKCarPriceAdapter implements PriceCalculator{
	private UKCarPriceCalculator ukCarPriceCalculator;
	
	public UKCarPriceAdapter(UKCarPriceCalculator ukCarPriceCalculator) {
		this.ukCarPriceCalculator = ukCarPriceCalculator;
	}
	
	@Override
	public double calculatePrice() {
		// TODO Auto-generated method stub
		return ukCarPriceCalculator.getPrice();
	}
}
