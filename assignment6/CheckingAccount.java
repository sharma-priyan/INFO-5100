package assignment6;

public class CheckingAccount extends Account {
	
	private static final double MinBalance=1000;
	private static final double PenaltyFee=200;
	public CheckingAccount(String fname, String lname, double cb){
		super(fname,lname,cb);
	}
	
	private void ChargeFee(){
		if (this.CurBalance<MinBalance){
			this.CurBalance=this.CurBalance-PenaltyFee;
			System.out.println("Penalty of $"+PenaltyFee+" is charged\n");
		}
	}
	@Override
	public double DebitTransaction(double debitAmount){
		super.DebitTransaction(debitAmount);
		ChargeFee();
		return CurBalance;
	}
	
	@Override
	public double CreditTransaction(double creditAmount){
		super.CreditTransaction(creditAmount);
		ChargeFee();
		return CurBalance;
	}
}
