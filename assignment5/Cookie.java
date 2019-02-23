package assignment5;

public class Cookie extends DessertItem{
	
	private int number;
	private int pricePerDozen;
	public Cookie(String itemName, int number, int pricePerDozen) {
		super(itemName);
		this.number=number;
		this.pricePerDozen=pricePerDozen;
	}
	@Override
	public int getCost() {
		double cost=(this.number)*(pricePerDozen/12.00);
		cost=Math.round(cost);
		return (int) cost;
	}

	public String toString(){		//Individual toString method for every Dessert item to define Price description and name
		String costDesc = number+" @ "+DessertShoppe.cents2dollarsAndCentsmethod(pricePerDozen)+" /dz " + "\n";
		String cost = DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		String formattedName = DessertShoppe.printItemInReceipt(name, cost);
		return costDesc + formattedName;
	}
}
