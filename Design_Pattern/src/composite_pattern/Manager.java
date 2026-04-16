package composite_pattern;

public class Manager implements Payee{
	private String name;
	
	public Manager(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public void payExpenses(int amount) {
		// TODO Auto-generated method stub
		System.out.println("Manager " + name + " has been paid " + amount + " dollars.");
	}
}
