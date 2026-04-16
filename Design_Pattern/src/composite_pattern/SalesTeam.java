package composite_pattern;

import java.util.ArrayList;
import java.util.List;

import composite_pattern.Payee;

public class SalesTeam implements Payee {
	private List<Payee> payees = new ArrayList<Payee>(); 
	
	
	public void addPayees(Payee... members) {
		for(Payee member : members) {
			payees.add(member);
		}
	}
	
	@Override
	public void payExpenses(int amount) {
		// TODO Auto-generated method stub
		for(Payee payee : payees) {
			payee.payExpenses(amount);
		}
	}
}
