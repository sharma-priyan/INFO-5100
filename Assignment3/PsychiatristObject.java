package assignment3;

class PsychiatristObject {
	
	public void examine(MoodyObject moodyObject) {
		System.out.println("How are you feeling today?");
		moodyObject.queryMood();
	}

	public void observe(MoodyObject moodyObject) {
		System.out.println("Observation:"+moodyObject.toString());
	}

}
