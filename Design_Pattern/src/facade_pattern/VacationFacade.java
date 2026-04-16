package facade_pattern;


public class VacationFacade {
	private static final VacationFacade INSTANCE = new VacationFacade();
	
	private FlightBooker flightBooker;
	private HotelBooker hotelBooker;
	private CarRental carRental;
	
	private VacationFacade() {
		flightBooker = new FlightBooker();
		hotelBooker = new HotelBooker();
		carRental = new CarRental();
	}
	
	public static VacationFacade getInstance() {
		return INSTANCE;
	}
	
	public void bookFullVacation(String destination, String hotelName, String carType) {
		System.out.println("Đang bắt đầu quy trình đặt kỳ nghỉ trọn gói...");
        flightBooker.bookFlight(destination);
        hotelBooker.reserveRoom(hotelName);
        carRental.rentCar(carType);
        System.out.println("Kỳ nghỉ của bạn đã sẵn sàng!");
	}
	
	
}
