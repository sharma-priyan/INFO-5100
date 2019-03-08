package assignment6;

import java.util.Calendar;

public class Dog extends Pet implements Boardable {
	private String size;
	int StartMon, StartDay, StartYear;
	int EndMon, EndDay, EndYear;

	public Dog(String name, String ownerName, String color, String size) {
		super(name, ownerName, color);
		this.size = size;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		StartMon = month;
		StartDay = day;
		StartYear = year;
	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		EndMon = month;
		EndDay = day;
		EndYear = year;
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, day);
		//System.out.println(c.getDob);
		Calendar start= Calendar.getInstance();
		start.set(StartYear, StartMon, StartDay);
		Calendar end= Calendar.getInstance();
		end.set(EndYear, EndMon, EndDay);
		if((c.compareTo(start)<0)||(end.compareTo(c)<0))
			return false;
		else
			return true;
		
	}

	public String getSize() {
		return this.size;
	}

	public String toString() {
		return getClass().getName() + ":\n" + super.toString() + "\nSize:" + getSize();
	}

	public static void main(String[] args) {
		Dog d1 = new Dog("Spot", "Susan", "white", "medium");
		//how to call Pet's  setsex method
		d1.setSex(4);
		d1.setBoardStart(4, 11, 2010);
		d1.setBoardEnd(3, 12, 2020);
		boolean flag = d1.boarding(4, 12, 2019);
		System.out.println(d1);
		if (flag == true)
			System.out.println("Date is valid");
		else
			System.out.println("Date is invalid");
	}
}
