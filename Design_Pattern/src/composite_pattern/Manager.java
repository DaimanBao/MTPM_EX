package composite_pattern;

public class Manager implements Payee{
	private String name;
	
	public Manager(String name) {
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
		System.out.println("Manager " + name + " has been paid " + amount + " dollars.");
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return "Manager: {'"+ name +" '}";
	}
}
