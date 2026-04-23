package composite_pattern;

public class SalesPerson implements Payee {
	private String name;
	
	public SalesPerson(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void addMember(Payee... memeber) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeMember(Payee member) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void payExpenses(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Salesperson " + name + " has been paid " + amount + " dollars.");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Sales person: {'"+ name +" '}";
	}
}
