package composite_pattern;

public class Client {
	public static void main(String[] args) {
		Payee m1 = new Manager("Bảo"); 
        Payee s1 = new SalesPerson("Chiến");
        Payee s2 = new SalesPerson("Chí");
        
        SalesTeam team = new SalesTeam();
        team.addMember(m1,s1,s2);
        
        team.payExpenses(500);
        
        team.removeMember(s1);
        
        for(Payee member : team) {
        	System.out.println(member.toString());
        }
	}
}
