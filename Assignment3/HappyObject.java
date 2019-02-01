package assignment3;


class HappyObject extends MoodyObject {
	
	@Override
	protected String getMood() {
		String mood = "happy";
		return mood;
	}

	@Override
	protected void expressFeelings() {
		System.out.println("hehehe...hahahah...HAHAHAHAHA!!!");

	}
	

	public String toString() {
		return "Subject laughs a lot";

	}
}

