package assignment6;

import java.util.*;

public class Mreview implements Comparable<Mreview> {

	private String title;
	private ArrayList<Integer> ratings;

	public Mreview(){
		this.title="";
		this.ratings=new ArrayList<Integer>();
	}
	
	public Mreview(String ttl){
		this.title=ttl;
		this.ratings=new ArrayList<Integer>();
	}
	
	public Mreview(String ttl, int firstRating){
		this.title=ttl;
		this.ratings=new ArrayList<Integer>(1);
		ratings.add(firstRating);
		
	}
	
	
	public String getTitle(){
		return this.title;
	}
	public void addRating(int r){
		ratings.add(r);
	}
	
	public int numRatings(){
		return ratings.size();
	}
	
	public double aveRating(){
		double sum=0;
		double avg=0;
		for(int i=0;i<numRatings();i++){
			sum+=ratings.get(i);
		}
		avg=sum/numRatings();
		return avg;
	}
	
	public String toString(){
		if(numRatings()==0){
			return getTitle()+" has No Rating\n";
		}
		return  getTitle()+", average "+aveRating()+" out of "+numRatings()+" ratings\n";
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return (this.title).compareTo(obj.title);
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		Mreview otherObj = (Mreview)obj;
		if(otherObj.title==null)
			return false;
		if(this.title!=otherObj.title)
			return false;
		System.out.println("equals method is called");
		return true;
		
	}
	
	public static void main(String[] args) {
		Mreview m1= new Mreview("Kill Bill",3);
		m1.addRating(4);
		m1.addRating(3);
		System.out.println(m1);
		System.out.println("Average rating of movie "+m1.toString());
		
		//creating a TreeSet in order to invoke compareTo method which is overriden in this class
		
		Mreview m2= new Mreview ("Avengers");
		Mreview m3= new Mreview("Titanic",4);
		Mreview m4= new Mreview("King Kong",4);
		TreeSet<Mreview> movieSet= new TreeSet<Mreview>();
		movieSet.add(m1);
		movieSet.add(m2);
		movieSet.add(m3);
		movieSet.add(m4);
		System.out.println(movieSet);
		
		//creating another MovieRatingCompare class and TreeSet in order to invoke compare method(sort according to rating)
		//which is overriden in MovieRatingCompare class
		
		MovieRatingCompare r1= new MovieRatingCompare();
		TreeSet<Mreview> movieSetByRating= new TreeSet<>(r1);
		movieSetByRating.add(m1);
		movieSetByRating.add(m2);
		movieSetByRating.add(m3);
		movieSetByRating.add(m4);
		System.out.println(movieSetByRating);
		
		
	}



}
