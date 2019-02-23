package assignment5;

import java.util.ArrayList;

public class Checkout {
	
	ArrayList<DessertItem> listOfItems = new ArrayList<DessertItem>();
	public Checkout()
	{
	
	}
	public void enterItem(DessertItem item) {
		listOfItems.add(item);
	}

	

	public int numberOfItems() {
		// TODO Auto-generated method stub
		return listOfItems.size();
	}

	public int totalCost() {
		int cost = 0;
		for(DessertItem list:listOfItems){
			cost+=list.getCost();
		}
		return cost;
	}

	public int totalTax() {
		double tax=0;
		for(DessertItem list:listOfItems){
			tax+=(list.getCost()*(DessertShoppe.taxRate/100));
		}
		return (int) tax;
	}

	public void clear() {
		listOfItems.clear();
	}
	
	//concatenate all the dessert items name using list
	public String toString(){
		String billReceipt="\t"+DessertShoppe.nameOfStore+"\t\n\t"+"- - - - - - - - - -\n";
		for(DessertItem list:listOfItems){
			billReceipt=billReceipt+list.toString()+"\n";
		}
		billReceipt=billReceipt+"Tax\t\t\t\t"+DessertShoppe.cents2dollarsAndCentsmethod(totalTax())+"\nTotal Cost\t\t\t"+DessertShoppe.cents2dollarsAndCentsmethod(totalCost()+totalTax());
		return billReceipt;
		
	}
}
