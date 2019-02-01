package assignment3;

abstract class MoodyObject {

	protected abstract String getMood();

	protected abstract void expressFeelings();

	public void queryMood() {
		System.out.println("I feel " + this.getMood() + " today");
	}
}
