package assignment6;

public class Pet {
	private String PetName;
	private String OwnerName;
	private String Color;
	protected Integer Sex;
	public static final int MALE=0;
	public static final int FEMALE=1;
	public static final int SPAYED=2;
	public static final int NEUTERED=3;
	
	
	public Pet (String name, String ownerName, String color){
		this.PetName=name;
		this.OwnerName=ownerName;
		this.Color=color;
	}
	public String getPetName(){
		return this.PetName;
	}
	
	public String getOwnerName(){
		return this.OwnerName;
	}
	
	public String getColor(){
		return this.Color;
	}
	
	public void setSex(int sexid){
		this.Sex=sexid;
		
	}
	public String getSex(){
		switch (this.Sex) 
        { 
        case 1: 
        	return "MALE";
		case 2: 
        	return "FEMALE";
		case 3:
        	return "SPAYED";
		case 4:
        	return "NEUTERED";
        	default:
        		return "Sex not provided";
        }
	}
	public String toString(){
		return getPetName()+" owned by "+getOwnerName()+"\nColor:"+getColor()+"\nSex:"+getSex();
	}
	
	public static void main(String[] args){
		
		Pet p1= new Pet("Spot","Mary","Black and White");
		p1.setSex(1);
		System.out.println(p1);
	}

	
}
