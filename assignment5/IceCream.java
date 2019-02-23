package assignment5;

public class IceCream extends DessertItem{
	
	int cost;
	public IceCream(String itemName, int cost) {
		super(itemName);
		this.cost=cost;
	}
	@Override
	public int getCost() {
		return this.cost;
	}
	
	public String toString(){	//Individual toString method for every Dessert item to define Price description and name
		String cost = DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		
		return DessertShoppe.printItemInReceipt(name, cost);
	}

}
