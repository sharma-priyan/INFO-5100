package assignment6;

public class Account {
	protected String FirstName = "";
	protected String LastName = "";
	protected double CurBalance;

	public Account(String fname, String lname, double curbalance) {
		this.FirstName = fname;
		this.LastName = lname;
		this.CurBalance = curbalance;
	}

	public String getAcctType() {
		return this.getClass().getName();
	}
	
	public double DebitTransaction(double debitAmount){
		this.CurBalance=this.CurBalance-debitAmount;
		return this.CurBalance;
	}
	
	public double CreditTransaction(double creditAmount){
		this.CurBalance=this.CurBalance+creditAmount;
		return this.CurBalance;
	}
	
	public String toString(){
		return "Account name: "+this.FirstName+" "+this.LastName+"\nAccount Type: "+getAcctType()+"\n Balance $"+this.CurBalance;
	}
	
	
	public static void main(String[] args) {
		Account ac1 = new Account("John", "Smith", 100);
	    System.out.println(ac1);

	    ac1.DebitTransaction(30.25); // should be $69.75
	    System.out.println(ac1);

	    ac1.CreditTransaction(10.10);
	    System.out.println(ac1); // should be $79.85
	    
	    Account ChAccount = new CheckingAccount("Bob","Smith",1500);
	    System.out.println(ChAccount);
	    
	    ChAccount.DebitTransaction(600);
	    System.out.println(ChAccount);
	    
	    ChAccount.CreditTransaction(400);
	    System.out.println(ChAccount);
	    
	    
	    
	    
	    
	    
	}

}
