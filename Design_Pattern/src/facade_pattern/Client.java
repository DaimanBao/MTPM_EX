package facade_pattern;

public class Client {
	public static void main(String[] args) {
		
		VacationFacade vacationFacade = VacationFacade.getInstance();
		
		vacationFacade.bookFullVacation("Quy Nhơn", "Hải Âu", "Xe hơi 7 chỗ");
	}
}
