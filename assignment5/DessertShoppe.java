package assignment5;

public class DessertShoppe {
	public static final String nameOfStore = "M & M Dessert Shoppe";
	public static final double taxRate = 6.5;
	public static final int sizeOfItem = 22;
	public static final int widthOfSpaceBetweenNameAndPrice = 15;

	public static String cents2dollarsAndCentsmethod(int cents) {
		float priceInDollars = cents*1.0f / 100;
		return Float.toString(priceInDollars);
	}
	
	//logic to left align the Item name with spaces
	public static String printItemInReceipt(String itemName, String price) {
		String formattedString = "";
		int mod = itemName.length() % sizeOfItem;
		int quot = itemName.length() / sizeOfItem;
		int start = 0;
		int end = 0;
		if (mod != 0) {
			quot = quot + 1;
		}
		for (int i = 1; i < quot; i++) {
			start = end;
			end = i * sizeOfItem;
			formattedString = formattedString + itemName.substring(start, end) + "\n";
		}
		start = end;
		end = itemName.length();
		int padding=(quot*sizeOfItem)-end;
		formattedString = formattedString + itemName.substring(start, end);
		
		return formattedString+returnStringWithWhiteSpaces(padding)+"\t\t"+price;
		
	}

	//method to add extra spaces when item name is less than fixed length
	private static String returnStringWithWhiteSpaces(int padding){
		String output="";
		for(int j=0;j<padding;j++){
			output+=" ";
		}
		return output;
	}

}
