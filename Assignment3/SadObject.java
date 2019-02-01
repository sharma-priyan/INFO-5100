package assignment3;

class SadObject extends MoodyObject {
	@Override
	protected String getMood() {
		String mood = "sad";
		return mood;
	}

	@Override
	protected void expressFeelings() {
		System.out.println(" 'wah' 'boo hoo' 'weep' 'sob' 'weep' ");

	}
	

	@Override
	public String toString() {
		return "Subject cries a lot";
	}
}
