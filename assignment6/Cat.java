package assignment6;

import java.util.Calendar;

public class Cat extends Pet implements Boardable{
	
	private String hairLength;
	int StartMon, StartDay, StartYear;
	int EndMon, EndDay, EndYear;

	
	public Cat (String name, String ownerName, String color, String hairLength){
		super(name,ownerName,color);
		this.hairLength=hairLength;
	}
	
	public String getHairLength(){
		return this.hairLength;
	}
	
	public String toString(){
		return getClass().getName()+":\n"+super.toString()+"\nHair:"+getHairLength();
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
	
	public static void main(String[] args) {
		Cat c1 = new Cat("Tom", "Bob", "black", "short");
		//how to call Pet's  setsex method
		c1.setSex(4);
		c1.setBoardStart(4, 11, 2010);
		c1.setBoardEnd(3, 12, 2020);
		boolean flag = c1.boarding(2, 12, 2020);
		System.out.println(c1);
		if (flag == true)
			System.out.println("Date is valid");
		else
			System.out.println("Date is invalid");
	}
}
