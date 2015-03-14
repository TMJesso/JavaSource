package myMediaLab;

public abstract class PlayableItem {
	protected String title;
	
	protected PlayableItem() {
		this.title = "";
	}
	protected PlayableItem(String title) {
		this.title = title;
	}
	
	protected String getTitle() {
		return this.title;
	}
	
	protected void setTitle(String title) {
		this.title = title;
	}
	
	public abstract void play();
	
}
