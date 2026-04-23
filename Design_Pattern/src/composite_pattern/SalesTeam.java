package composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import composite_pattern.Payee;

public class SalesTeam implements Payee, Iterable<Payee> {
	private List<Payee> payees = new ArrayList<Payee>(); 
	
	@Override
	public void addMember(Payee... members) {
		// TODO Auto-generated method stub
		for(Payee member : members) {
			payees.add(member);
		}	
	}
	
	@Override
	public void removeMember(Payee member) {
		payees.remove(member);
	}
	
	
	@Override
	public void payExpenses(int amount) {
		// TODO Auto-generated method stub
		for(Payee payee : payees) {
			payee.payExpenses(amount);
		}
	}
	
	   @Override
	    public Iterator<Payee> iterator() {
	        return payees.iterator();
	    }
}
