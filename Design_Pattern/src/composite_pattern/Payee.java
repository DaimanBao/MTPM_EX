package composite_pattern;

public interface Payee {
	
	void addMember(Payee... memeber);
	
	void removeMember(Payee member);
	
	void payExpenses(int amount);
}
