package assignment5;

public class Candy extends DessertItem{
	
	private double weight;
	private int pricePerPound;
	public Candy(String itemName, double weight, int pricePerPound) {
		super(itemName);
		this.weight=weight;
		this.pricePerPound=pricePerPound;
	}
	@Override
	public int getCost() {
		double cost=this.weight*pricePerPound;
		cost=Math.round(cost);
		return (int) cost;
		
	}
	
	public String toString(){	//Individual toString method for every Dessert item to define Price description and name
		
		String costDesc = weight+" lbs. @ "+DessertShoppe.cents2dollarsAndCentsmethod(pricePerPound)+" /lb " + "\n";
		String cost = DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		String formattedName = DessertShoppe.printItemInReceipt(name, cost);
		return costDesc + formattedName;
		
	}
	

}
