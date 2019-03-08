package assignment6;

import java.util.*;

// this class is to compare movie objects based on average ratings and if movie rating is same, it will sort lexicographically 
public class MovieRatingCompare implements Comparator<Mreview> {

	@Override
	public int compare(Mreview o1, Mreview o2) {
		
		if(getAvgRating(o1)>getAvgRating(o2))
		return -1;
		else if (getAvgRating(o1)<getAvgRating(o2))
			return 1;
		return o1.compareTo(o2);
	}

	private double getAvgRating(Mreview o){
		if(o.numRatings()==0)
			
		return 0;
		else
			
		return o.aveRating();
	}
}
