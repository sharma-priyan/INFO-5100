package assignment3;

public class Question2 {
	public static void main(String[] args) {
		PsychiatristObject psyObject= new PsychiatristObject();
		
		MoodyObject happyObj= new HappyObject();
		MoodyObject sadObj= new SadObject();
		psyObject.examine(happyObj);
		happyObj.expressFeelings();
		psyObject.observe(happyObj);
		psyObject.examine(sadObj);
		sadObj.expressFeelings();
		psyObject.observe(sadObj);
		
	}
}
