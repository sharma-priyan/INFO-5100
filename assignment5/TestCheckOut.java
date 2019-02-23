package assignment5;

public class TestCheckOut {
	public static void main(String[] args) {
		Checkout checkout = new Checkout();
		checkout.enterItem(new Candy("Peanut Butter Fudge", 2.25, 399));
		checkout.enterItem(new IceCream("Vanilla Ice Cream", 105));
		checkout.enterItem(new Sundae("Choc. Chip Ice Cream", 145, "Hot Fudge", 50));
		checkout.enterItem(new Cookie("Oatmeal Raisin Cookies", 4, 399));
		System.out.println("\nNumber of items: " + checkout.numberOfItems() + "\n");
		System.out.println("\nTotal cost: " + checkout.totalCost() + "\n");
		System.out.println("\nTotal tax: " + checkout.totalTax() + "\n");
		System.out.println("\nCost + Tax: " + (checkout.totalCost() + checkout.totalTax()) + "\n");
		System.out.println(checkout);
		//checkout.clear();
		Checkout checkout1 = new Checkout();
		checkout1.enterItem(new IceCream("Strawberry Ice Cream", 145));
		checkout1.enterItem(new Sundae("Vanilla Ice Cream", 105, "Caramel", 50));
		checkout1.enterItem(new Candy("Gummy Worms", 1.33, 89));
		checkout1.enterItem(new Cookie("Chocolate Chip Cookies", 4, 399));
		checkout1.enterItem(new Candy("Salt Water Taffy", 1.5, 209));
		checkout1.enterItem(new Candy("Candy Corn", 3.0, 109));
		System.out.println("\nNumber of items: " + checkout1.numberOfItems() + "\n");
		System.out.println("\nTotal cost: " + checkout1.totalCost() + "\n");
		System.out.println("\nTotal tax: " + checkout1.totalTax() + "\n");
		System.out.println("\nCost + Tax: " + (checkout1.totalCost() + checkout1.totalTax()) + "\n");
		System.out.println(checkout1);
	}
}